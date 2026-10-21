package com.jdbcmavendemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    // Add / Insert Employee
    public int addEmployee(Employee employee) throws SQLException {

        String sql = "INSERT INTO EMPLOYEES(name,email,department,salary) VALUES(?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getDepartment());
            ps.setBigDecimal(4, employee.getSalary());

            int rowAffected = ps.executeUpdate();

            if (rowAffected == 1) {

                try (ResultSet keys = ps.getGeneratedKeys()) {

                    if (keys.next()) {
                        employee.setId(keys.getInt(1));
                    }
                }
            }

            return rowAffected;
        }
    }

    // Fetch / Get Employee By ID
    public Employee getEmployeeById(int id) throws SQLException {

        String sql = "SELECT id,name,email,department,salary FROM EMPLOYEES WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    Employee employee = new Employee(
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("department"),
                            rs.getBigDecimal("salary"));

                    employee.setId(rs.getInt("id"));

                    return employee;
                }

                return null;
            }
        }
    }

    // Get All Employees
    public List<Employee> getAllEmployees() throws SQLException {

        String sql = "SELECT id,name,email,department,salary FROM EMPLOYEES ORDER BY id";

        List<Employee> employeesList = new ArrayList<>();

        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Employee employee = new Employee(
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("department"),
                        rs.getBigDecimal("salary"));

                employee.setId(rs.getInt("id"));

                employeesList.add(employee);
            }
        }

        return employeesList;
    }

    // Update Employee
    public int updateEmployee(Employee employee) throws SQLException {

        String sql = "UPDATE EMPLOYEES SET name = ?, email = ?, department = ?, salary = ? WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getDepartment());
            ps.setBigDecimal(4, employee.getSalary());
            ps.setInt(5, employee.getId());

            return ps.executeUpdate();
        }
    }

    // Delete Employee
    public int deleteEmployee(int id) throws SQLException {

        String sql = "DELETE FROM EMPLOYEES WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            return ps.executeUpdate();
        }
    }
}