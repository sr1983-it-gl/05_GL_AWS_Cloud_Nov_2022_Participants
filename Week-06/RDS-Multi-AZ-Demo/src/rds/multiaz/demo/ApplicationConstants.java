package rds.multiaz.demo;

public class ApplicationConstants {

	public static String DRIVER_CLASS_NAME 
		= "com.mysql.cj.jdbc.Driver";

	public static String HOST = 
			
"rds-multi-az-db-instance-01.cnq8huiucjab.us-east-1.rds.amazonaws.com";
	
	public static String DB_NAME = "mydb";
	
	public static String USERNAME = "admin";
	
	public static String PASSWORD = "password";
	
	public static String CONNECTION_URL
		=	"jdbc:mysql://" + HOST + ":3306/" + DB_NAME;
	
}
