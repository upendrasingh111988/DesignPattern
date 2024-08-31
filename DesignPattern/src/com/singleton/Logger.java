package com.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    // The single instance of the Logger
    private static volatile Logger instance;

    // The writer used to write logs to a file
    private PrintWriter writer;

    // Private constructor to prevent instantiation
    private Logger() {
        try {
            // Open the file in append mode
            FileWriter fileWriter = new FileWriter("application.log", true);
            writer = new PrintWriter(fileWriter, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Method to log a message with a timestamp
    public void log(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        writer.println(timestamp + " - " + message);
    }

    // Method to close the logger (optional, for clean-up)
    public void close() {
        if (writer != null) {
            writer.close();
        }
    }
}

