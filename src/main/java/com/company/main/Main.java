package com.company.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void foo() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "Huner1997";
        Connection c = DriverManager.getConnection(url, username, password);
        Statement st = c.createStatement();
        st.execute("select * from user ");
        ResultSet rs = st.getResultSet();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            String phone = rs.getString("phone");
            String email = rs.getString("email");

            System.out.println("id=" + id);
            System.out.println("name=" + name);
            System.out.println("surname=" + surname);
            System.out.println("phone=" + phone);
            System.out.println("email=" + email);
            System.out.println("----------------");


        }


    }

    public static void main(String[] args) throws Exception {
        foo();

    }
}
