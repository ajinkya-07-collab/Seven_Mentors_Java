package Recursion;

public class RecursionDemo {

    static void printNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumber(n - 1);
    }

    public static void main(String[] args) {
        printNumber(10);
    }

}
