package database.demo;

public class ApplicationConstants {

	public static String DRIVER_CLASS_NAME 
		= "com.mysql.cj.jdbc.Driver";

	public static String HOST = "localhost";
	
//	public static String DB_NAME = "docker-db";
	public static String DB_NAME = "player-db";
	
	public static String USERNAME = "root";
	
	public static String PASSWORD = "testpassword";
//	public static String PASSWORD = "mypassword_11";
	
//	public static int PORT_NO = 3306;
	public static int PORT_NO = 5555;
	
	public static String CONNECTION_URL
		=	"jdbc:mysql://" + HOST + ":" + PORT_NO + "/" + DB_NAME;
	
}
