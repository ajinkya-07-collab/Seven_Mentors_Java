package com.jdbcmavendemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String sql = "select * from employees order by id";

        try (Connection con = DBConnection.getConnection();
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql)) {
            System.out.println("MySQL Connected Successfully!!");
            System.out.println("----------------------------------------------");
            while (rs.next()) {
                System.out.println("ID : " + rs.getInt("id"));
                System.out.println("Name : " + rs.getString("name"));
                System.out.println("Email : " + rs.getString("email"));
                System.out.println("Department : " + rs.getString("department"));
                System.out.println("Salary : " + rs.getBigDecimal("salary"));
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Database Operation Failed !");
            e.printStackTrace();
        }
    }
}