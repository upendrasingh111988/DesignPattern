package com.singleton;

public class MainApplicationLogger {

	public static void main(String[] args) {
		 // Retrieve the singleton logger instance
        Logger logger = Logger.getInstance();

        // Log some messages
        logger.log("Application started");
        logger.log("Performing some operation...");
        logger.log("Application finished");

        // Close the logger (optional)
        logger.close();

	}

}
