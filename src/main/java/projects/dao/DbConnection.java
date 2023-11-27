package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {
private static String HOST = "localhost";
private static String PASSWORD = "projects";
private static int PORT = 3306;
private static String SCHEMA = "projects";
private static String USER = "projects";

public static Connection getConnection()
{ 
	Connection connection = null;
	 String uri = "jdbc:mysql://localhost:3306/projects";
     String username = "projects";
     String password = "projects";
	try {
  
    connection = DriverManager.getConnection(uri, username, password);
    System.out.println("connection is successful >:3");
} catch (SQLException e) {
    e.printStackTrace();
    throw new DbException("Failed to connect to the database.");
}

return connection;
}}



