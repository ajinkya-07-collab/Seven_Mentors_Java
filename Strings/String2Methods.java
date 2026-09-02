package Strings;

import java.util.Scanner;

public class String2Methods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nameCollection = "Amol,Amit,Tushar,Ravi,Adya,Nilesh,Nana,Pratik";

        String[] names = nameCollection.split(",", 2);

        for (String n : names) {
            System.out.print(n + " | ");
        }
    }
}
