package com.vwits.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {
	Connection con;
    Statement st;
    PreparedStatement ps;

 

    public MyConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

 

    public Connection openConnection() {
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system", "root");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }

 

    public void closeConnection() {
        try {
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

 

    public Statement getStatement() {
        try {
            st = this.openConnection().createStatement();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return st;

 

    }
    
    public PreparedStatement getPreparedStatement(String sqlQuery) {
        
        try {
            ps=this.openConnection().prepareStatement(sqlQuery);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return ps;
    }
}
