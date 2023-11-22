package com.example.planningpokerproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaseLink;

    public DatabaseConnection() {
    }

    public Connection getConnection() {
        String databaseName = "planningpoker";
        String databaseUser = "root"; //Replace with correct username
        String databasePassword = "root"; //Replace with correct password
        String url = "jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        return this.databaseLink;
    }
}
