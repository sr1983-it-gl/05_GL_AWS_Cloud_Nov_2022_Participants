package database.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class JDBCConnectDemo {

	public static void main(String[] args) {
		
		String mySqlDriverClassName 
		= ApplicationConstants.DRIVER_CLASS_NAME;
		
		try {
			Class.forName(mySqlDriverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String connectionUrl = ApplicationConstants.CONNECTION_URL;
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			
			connection = DriverManager.getConnection(
				connectionUrl,
				ApplicationConstants.USERNAME,
				ApplicationConstants.PASSWORD);

			try {
				InetAddress address = InetAddress.getByName(ApplicationConstants.HOST);

				System.out.println(address.getHostAddress());
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
			
			System.out.println("Database Connection DONE");
			System.out.println(new Date().toString());

			
			statement = connection.createStatement();
						
//			String tableName = ApplicationConstants.DB_NAME + ".player";
			String selectQuery = String.format(
					"SELECT ID, NAME, COUNTRY from player" );		
			
			System.out.println(selectQuery);
			
			resultSet = statement.executeQuery(selectQuery);
			
			while (resultSet.next()) {

				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String country = resultSet.getString(3);
							
				System.out.println(
					String.format("Id is %d, Name is %s and Country is %s", 
						id, name, country));
			}
									
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
			
	}
}
