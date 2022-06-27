package com.jdbc.basic;

import java.sql.*; // Step-1

public class Main {
    public static void main(String[] args) {

        Class.forName("com.mysql.jdbc.Driver"); // Step-2.b

        String url = "jdbc:mysql://localhost:3307/sakila";
        String un = "root";
        String pw = "rootmysql";
        Connection con = DriverManager.getConnection(url, un, pw); // Step-3

        Statement st = con.createStatement(); // Step-4

        // Step-5
        String query = "select * from actor";
        ResultSet rs = st.executeQuery(query);

        // Step-6
        while (rs.next()) {
            System.out.println(rs.getInt(1) + ": " + rs.getString(2));
        }

        // Step-7
        rs.close();
        con.close();
    }
}
