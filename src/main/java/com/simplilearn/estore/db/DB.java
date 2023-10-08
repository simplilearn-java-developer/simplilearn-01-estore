package com.simplilearn.estore.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {

    private static final String TAG = "DB ";

    private static DB db = new DB();

    Connection connection;

    Statement statement;

    public static DB getDB() {
        return db;
    }
    
    private DB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println(TAG+"Driver Loaded");
            initialize();
        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
        }
    }

    public void initialize() {
        try {
            String url = "jdbc:mysql://localhost:8080/estore";
            String user = "john";
            String password = "john";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println(TAG+"Connection Created");
            statement = connection.createStatement();
            System.out.println(TAG+"Statement Created");
        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
        }
    }

    public int executeUpdate(String sql) {
        int result = 0;
        try {
            System.out.println(TAG+"Executing SQL "+sql+" ...");
            result = statement.executeUpdate(sql);
            System.out.println(TAG+"Statement Executed Successfully");
        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
        }
        return result;
    }

    public ResultSet executeQuery(String sql) {
        ResultSet set = null;
        try {
            System.out.println(TAG+"Executing SQL "+sql+" ...");
            set = statement.executeQuery(sql);
            System.out.println(TAG+"Statement Executed Successfully");
        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
        }
        return set;
    }

    public void close() {
        try {
            connection.close();
            System.out.println(TAG+"Connection Closed");
        } catch (Exception e) {
            System.out.println("Something Went Wrong: "+e);
        }
    }
}
