package Lecture_10.While_DoWhile;

import java.util.Scanner;

public class OTP_Verification {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int otp = 1234;
        int userOtp;

        do {
            System.out.println("Enter OTP : ");
            userOtp = sc.nextInt();

            if (otp != userOtp) {
                System.out.println("WRONG OTP -> Enter Again");
            }
        } while (otp != userOtp);

        System.out.println("OTP Verification Successfull");
        sc.close();
    }

}
