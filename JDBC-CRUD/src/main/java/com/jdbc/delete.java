package com.jdbc;

import java.sql.*;

public class delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/axis";
        String username = "root";
        String pass = "12345";

        String name = "Suresh";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,pass);
        Statement st = con.createStatement();

        int x = st.executeUpdate("DELETE from p_info WHERE name = '"+name+"'");

        System.out.println("Deleted successfully");
        st.close();
        con.close();
    }
}
