package com.jdbc;
import java.sql.*;
import java.sql.DriverManager;

public class Select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/axis";
        String username = "root";
        String pass = "12345";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from p_info");

        while(rs.next()){
            rs.getString("name");
            System.out.println(rs.getString("name")+" : "+rs.getInt("Age")+" : "+rs.getString("Source")+" -> "+rs.getString("Destination"));
        }
        st.close();
        con.close();
    }
}
