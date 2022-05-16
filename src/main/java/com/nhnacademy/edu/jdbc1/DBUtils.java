package com.nhnacademy.edu.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://133.186.211.156:3306/nhn_academy_28", "nhn_academy_28", ")Cc2Hel@p76OdOU0");
    }
}
