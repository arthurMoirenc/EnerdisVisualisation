package com.example;

import java.sql.*;

public class Database {
    //private static final String URL = "jdbc:sqlite:C:/Users/arthu/OneDrive/Desktop/bddEnerdis/bddEnerdisVisual.db";
    private static final String URL = "jdbc:sqlite:C:/Users/arthu/OneDrive/Desktop/bddEnerdis/rpi.sqlite";


    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
