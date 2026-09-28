package PredefinedMethods;

import java.util.Scanner;

public class Practice_Student {

    static int total(int[] marks) {
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        return sum;
    }

    static double average(int[] marks) {
        return (double) total(marks) / marks.length;
    }

    static int minimum(int[] marks) {
        int min = marks[0];

        for (int i = 1; i < marks.length; i++) {
            min = Math.min(min, marks[i]);
        }

        return min;
    }

    static int maximum(int[] marks) {
        int max = marks[0];

        for (int i = 1; i < marks.length; i++) {
            max = Math.max(max, marks[i]);
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.println("\n----- Student Result -----");
        System.out.println("Name     : " + name);
        System.out.println("Total    : " + total(marks));
        System.out.println("Average  : " + average(marks));
        System.out.println("Minimum  : " + minimum(marks));
        System.out.println("Maximum  : " + maximum(marks));

        sc.close();
    }
}
