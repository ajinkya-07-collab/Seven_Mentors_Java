package Lecture_10.While_DoWhile;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary : ");
        double salary = sc.nextInt();

        double total = 0;
        for (int month = 1; month <= 12; month++) {
            salary = salary * 1.05;

            System.out.println("Month : " + month + " Salary : " + salary);
            total += salary;
        }

        System.out.println("Total Salary of 12 months : " + total);
        sc.close();

    }
}
