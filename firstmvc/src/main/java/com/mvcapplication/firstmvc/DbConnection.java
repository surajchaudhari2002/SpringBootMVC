package com.mvcapplication.firstmvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection DbConnect() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/iplteams",
            "root",
            "Suraj@2002");
    return connection;
}

}
