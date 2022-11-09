package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/axis";
        String username = "root";
        String pass = "12345";

        String name = "Aarti";
        int age = 31;

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,pass);
        Statement st = con.createStatement();

        int x = st.executeUpdate("UPDATE p_info SET name = '"+name+"' WHERE age = '"+age+"'");

        System.out.println("Updated successfully");
        st.close();
        con.close();
    }
}
