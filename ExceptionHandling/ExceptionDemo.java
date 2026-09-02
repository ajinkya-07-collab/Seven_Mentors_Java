package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter The 1st num : ");
            int a = sc.nextInt();
            System.out.println("Enter The 1st num : ");
            int b = sc.nextInt();

            int c = a / b;

            System.out.println(c);

        } catch (ArithmeticException ae) {
            // System.out.println("Arithmatic : /0");
        } catch (Exception e) {
            System.out.println("Exception : /0");

        } finally {
            System.out.println("Finally");
            try {
                int[] arr = { 1, 2, 3, 4, 5 };
                System.out.println(arr[8]);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Array Index Out of Bound");
            } finally {
                System.out.println("inner Finally");
            }
        }
    }
}
