package DAO;

import java.sql.*;

public class ConnectOp {
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://101.132.33.149:3306/Fengxutong";
    private static String USERNAME = "root";
    private static String PASSWORD = "123456";

    public static Integer insert(String sql){
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
            Integer executeUpdate = statement.executeUpdate(sql);
            return executeUpdate;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public static Integer delete(String sql){
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
            Integer executeUpdate = statement.executeUpdate(sql);
            return executeUpdate;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public static Integer update(String sql){
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
            Integer executeUpdate = statement.executeUpdate(sql);
            return executeUpdate;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public static ResultSet select(String sql){
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

        }
        return null;
    }
}
