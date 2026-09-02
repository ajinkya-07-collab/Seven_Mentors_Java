package ExceptionHandling;

import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 18) {
            throw new ArithmeticException("Age Must be above 18");
        }
        System.out.println("Person is eleible to vote");
    }
}
