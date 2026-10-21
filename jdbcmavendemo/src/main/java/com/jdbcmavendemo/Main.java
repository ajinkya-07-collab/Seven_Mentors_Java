package com.jdbcmavendemo;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAO();

        try (Scanner sc = new Scanner(System.in)) {

            int choice;

            do {

                System.out.println("\n==============================");
                System.out.println("   EMPLOYEE MANAGEMENT SYSTEM");
                System.out.println("==============================");
                System.out.println("1. Add Employee");
                System.out.println("2. Get Employee By ID");
                System.out.println("3. Get All Employees");
                System.out.println("4. Update Employee");
                System.out.println("5. Delete Employee");
                System.out.println("6. Exit");
                System.out.println("==============================");

                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    // 1. ADD EMPLOYEE
                    case 1:

                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine().trim();

                        System.out.print("Enter Employee Email: ");
                        String email = sc.nextLine().trim();

                        System.out.print("Enter Employee Department: ");
                        String department = sc.nextLine().trim();

                        System.out.print("Enter Employee Salary: ");
                        BigDecimal salary = new BigDecimal(sc.nextLine().trim());

                        if (name.isBlank() || email.isBlank() || department.isBlank() || salary.signum() < 0) {

                            System.out.println("Invalid Employee Details!");
                            break;
                        }

                        Employee employee = new Employee(name, email, department, salary);

                        int addRows = employeeDAO.addEmployee(employee);

                        if (addRows == 1) {

                            System.out.println("Employee created successfully!");

                            System.out.println("Generated Employee ID: " + employee.getId());

                        } else {

                            System.out.println("Employee was not created!");
                        }

                        break;

                    // 2. GET EMPLOYEE BY ID
                    case 2:

                        System.out.print("Enter Employee ID: ");
                        int id = Integer.parseInt(sc.nextLine());

                        Employee emp = employeeDAO.getEmployeeById(id);

                        if (emp != null) {

                            System.out.println("\nEmployee Details");
                            System.out.println("----------------------");
                            System.out.println("ID: " + emp.getId());
                            System.out.println("Name: " + emp.getName());
                            System.out.println("Email: " + emp.getEmail());
                            System.out.println("Department: " + emp.getDepartment());
                            System.out.println("Salary: " + emp.getSalary());

                        } else {
                            System.out.println("Employee not found!");
                        }

                        break;

                    // 3. GET ALL EMPLOYEES
                    case 3:

                        List<Employee> employees = employeeDAO.getAllEmployees();

                        if (employees.isEmpty()) {
                            System.out.println("No employees found!");

                        } else {
                            System.out.println("\nEmployee List");
                            System.out.println("----------------------");

                            for (Employee emp1 : employees) {

                                System.out.println("ID: " + emp1.getId());
                                System.out.println("Name: " + emp1.getName());
                                System.out.println("Email: " + emp1.getEmail());
                                System.out.println("Department: " + emp1.getDepartment());
                                System.out.println("Salary: " + emp1.getSalary());
                                System.out.println("----------------------");

                            }
                        }

                        break;

                    // 4. UPDATE EMPLOYEE
                    case 4:

                        System.out.print(
                                "Enter Employee ID: ");

                        int updateId = Integer.parseInt(sc.nextLine());

                        System.out.print(
                                "Enter New Name: ");

                        String newName = sc.nextLine().trim();

                        System.out.print(
                                "Enter New Email: ");

                        String newEmail = sc.nextLine().trim();

                        System.out.print(
                                "Enter New Department: ");

                        String newDepartment = sc.nextLine().trim();

                        System.out.print(
                                "Enter New Salary: ");

                        BigDecimal newSalary = new BigDecimal(
                                sc.nextLine().trim());

                        Employee updateEmployee = new Employee(
                                newName,
                                newEmail,
                                newDepartment,
                                newSalary);

                        updateEmployee.setId(updateId);

                        int updateRows = employeeDAO.updateEmployee(
                                updateEmployee);

                        if (updateRows == 1) {

                            System.out.println(
                                    "Employee updated successfully!");

                        } else {

                            System.out.println(
                                    "Employee not found!");
                        }

                        break;

                    // 5. DELETE EMPLOYEE
                    case 5:

                        System.out.print(
                                "Enter Employee ID: ");

                        int deleteId = Integer.parseInt(sc.nextLine());

                        int deleteRows = employeeDAO.deleteEmployee(
                                deleteId);

                        if (deleteRows == 1) {
                            System.out.println("Employee deleted successfully!");
                        } else {
                            System.out.println("Employee not found!");
                        }

                        break;

                    // 6. EXIT
                    case 6:

                        System.out.println("Thank you! Exiting...");
                        break;

                    default:

                        System.out.println("Invalid choice! Enter 1 to 6.");
                }

            } while (choice != 6);

        } catch (NumberFormatException e) {

            System.out.println("Please enter a valid number!");

        } catch (SQLException e) {

            System.out.println("Database Operation Failed: " + e.getMessage());
        }
    }
}