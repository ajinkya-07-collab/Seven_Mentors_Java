package Recursion;

import java.util.Arrays;

public class Fibonacci {

    static void fib(int a, int b, int n) {

        if (n == 0) {
            return;
        }

        System.out.print(a + " ");

        int c = a + b;

        fib(b, c, n - 1);
    }

    static int fibonacci(int n, int[] arr) {
        if (n <= 1) {
            return 1;
        }

        if (arr[n] != -1) {
            return arr[n];
        }

        arr[n] = fibonacci(n - 1, arr) + fibonacci(n - 2, arr);

        return arr[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        System.out.println(fibonacci(n, arr));

    }

}
