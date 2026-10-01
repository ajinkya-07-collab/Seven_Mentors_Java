package Collections;

import java.util.LinkedList;
import java.util.List;

class Employee {
    int id;
    String name;
    String address;
    int age;
    String gender;
    double salary;

    public Employee() {
        super();
    }

    public Employee(int id, String name, String address, int age, String gender, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

public class LinkedListDemo {

    public static void main(String[] args) {

        Employee emp = new Employee();

        List<Employee> employee = new LinkedList<>(); // avoid - not recommended

        for (Object o : employee) {
            System.out.println(o);
        }

        List<String> empName = new LinkedList<>();

        empName.add("Amol");
        empName.add("Tushar");
        empName.add("Sumit");
        empName.add("Roshan");
        empName.add("Amol");

    }

}
