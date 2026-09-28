package PredefinedMethods;

public class MathMethods {

    public static void main(String[] args) {

        // square root
        System.out.println(Math.sqrt(36));

        // power
        System.out.println(Math.pow(5, 2)); // 25

        double r = 21.25;
        double area = Math.PI * Math.pow(r, 2);
        System.out.println("Area of Circle with radius " + r + " is " + area);
        System.out.println("Floor : " + Math.floor(area));
        System.out.println("Ceil : " + Math.ceil(area));
        System.out.println("Round : " + Math.round(area));

        System.out.println("Random betwen 0- 1 " + Math.random());// range between 0-1

        System.out.println("Random Between 1 - 10 " + Math.random() * 10);

        System.out.println(Math.abs(-20.45));// 20.45

        System.out.println(Math.max(5, 10));

        int min = 1000;
        int max = 9999;

        int otp = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Your OTP : " + otp);
    }

}
