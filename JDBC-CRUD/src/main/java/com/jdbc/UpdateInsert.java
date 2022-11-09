package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/axis";
        String username = "root";
        String pass = "12345";

        String name = "Arun";
        int age = 26;
        String source = "KA";
        String destination = "DL";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,pass);
        Statement st = con.createStatement();

        int x = st.executeUpdate("INSERT into p_info values('"+name+"', '"+age+"', '"+source+"', '"+destination+"')");
        if(x>0)
            System.out.println("Successfully Inserted");
        else System.out.println("Insert Failed");

        st.close();
        con.close();
    }
}
