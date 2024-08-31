package com.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
	
	//// The single instance of this class
	private static volatile DatabaseConnectionManager instance;
	
	// Database connection instance
	private Connection connection;
	
	// Database connection parameters
    // Database connection parameters
    private String url = "jdbc:mysql://localhost:3306/mydatabase";
    private String username = "user";
    private String password = "password";
    
 // Private constructor to prevent instantiation
    private DatabaseConnectionManager() throws SQLException {
    	// Load the database driver (optional for some JDBC drivers)
    	try {
    		
			Class.forName("com.mysql.jdbc.Driver");
			// Create a connection to the database
			this.connection= DriverManager.getConnection(url,username,password);
			
		} catch (ClassNotFoundException e) {
			
			throw new SQLException("Database Driver not found!", e);
		}
    }
 // Public method to provide access to the instance
    
    public DatabaseConnectionManager getInstance() throws SQLException {
    	if(instance==null) {
    		synchronized (DatabaseConnectionManager.class) {
    			if(instance==null) {
    				instance= new DatabaseConnectionManager();
    			}
				
			}
    		
    	}
    	return instance;
    	
    }
    
 // Method to get the database connection
    public Connection getConnection() {
    	
    	return connection;
    }
    
 // Method to close the connection (if needed)
    
    public void closeConnection() throws SQLException {
    	if(connection!=null && connection.isClosed()) {
    		
    		connection.close();
    	}
    }
    
    
    
    
}
