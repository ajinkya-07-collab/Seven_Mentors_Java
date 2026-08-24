package Arrays;

import java.util.Scanner;

public class twoDArray {

    public static int[][] add(int[][] a, int[][] b, int rows, int cols) {

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }

        }

        return result;
    }

    public static int[][] subtract(int[][] a, int[][] b, int rows, int cols) {

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }

        }

        return result;
    }

    public static int[][] multiply(int[][] a, int[][] b, int rows, int cols) {

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] * b[i][j];
            }

        }

        return result;

    }

    public static void display(int[][] arr, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter Colums : ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];

        System.out.println("Enter 1st Array : ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter 2nd Array : ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }

        }

        System.out.println("Addition : ");
        display(add(a, b, cols, cols), cols, cols);

        System.out.println("Subtraction : ");
        display(subtract(a, b, cols, cols), cols, cols);

        System.out.println("Multiplication : ");
        display(multiply(a, b, cols, cols), cols, cols);

        sc.close();
    }

}
