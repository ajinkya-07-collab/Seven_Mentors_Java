package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CollectionProject1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Collection<String> employees = new ArrayList<>();

        // Adding Employees

        employees.add("Ajinkya");
        employees.add("Ravikiran");
        employees.add("Aditya");
        employees.add("Pratik");
        employees.add("Yogita");

        System.out.println(employees.size());
        System.out.println("Employees List : " + employees);

        System.out.println("Employees List : ");
        for (String emp : employees) {
            System.out.println(emp);

        }

        // search
        System.out.println("Enter the name to search :");
        String target = sc.next();

        System.out.println(employees.contains(target) ? target + " Name Available" : target + " Not Available"); // can
                                                                                                                 // do
                                                                                                                 // using
                                                                                                                 // if/else

        System.out.println("Enter Name to Remove :");
        String removed = sc.next();

        if (employees.contains(removed)) {
            System.out.println(removed + " is Present in employee");
            employees.remove(removed);
            System.out.println(removed + " Removed from employee");
            System.out.println("Employee List : " + employees);
        } else {
            System.out.println(removed + " not present in employee");
        }

        employees.clear(); // returns void so no SOP
        System.out.println(employees.isEmpty());

    }

}
