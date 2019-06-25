package com.liyan.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.UUID;

public class DB {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/demo?useUnicode=true&characterEncoding=utf-8";
    private static final String UNAME = "root";
    private static final String PWD = "root";
    private static Connection connection=null;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(URL,UNAME, PWD);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return  connection;
    }
}
