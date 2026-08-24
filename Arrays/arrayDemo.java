package Arrays;

import java.util.Scanner;

class ArrayInput {

    public void arrayFunction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();

        String cityName[] = new String[size];

        System.out.println("Enter " + size + " CityName : ");
        for (int i = 0; i < cityName.length; i++) {
            cityName[i] = sc.next();
        }
        System.out.println("OUTPUT:");
        for (String string : cityName) {
            System.out.println(string + " ");
        }
        System.out.println("Enter city To find : ");
        String city = sc.next();
        searchCity(cityName, city);
        sc.close();
    }

    public void searchCity(String[] cityName, String city) {
        for (String c : cityName) {
            if (c.equals(city)) {
                System.out.println(city + " is Match");
                break;
            }
        }
        System.out.println(city + " is Not Found");
    }

    public class arrayDemo {
        public static void main(String[] args) {

            ArrayInput ap = new ArrayInput();
            ap.arrayFunction();

            // int[] num = { 5, 3, 6, 2, 8, 6, 1 };

            // for (int n : num) {
            // System.out.println("Square of " + n + " : " + n * n);
            // }

            // int sum = 0;
            // int largest = num[0];
            // int smallest = num[0];

            // for (int i = 0; i < num.length; i++) {
            // if (num[i] > largest) {
            // largest = num[i];
            // }
            // if (num[i] < smallest) {
            // smallest = num[i];
            // }

            // }
            // System.out.println("Largest : " + largest);
            // System.out.println("Smallest : " + smallest);

            // for (int i = 0; i < num.length; i++) {
            // sum += num[i];
            // }
            // System.out.println("sum:" + sum);

            // for (int i = 0; i < num.length; i++) {
            // System.out.print(num[i] + " ");
            // }
            // System.out.println();
            // for (int i = num.length - 1; i >= 0; i--) {
            // System.out.print(num[i] + " ");

            // }

        }
    }
}
