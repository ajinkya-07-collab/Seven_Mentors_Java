package OOPs.Inheritance;

import java.util.Scanner;

public class InheritanceMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Data ");

        int id = sc.nextInt();
        String name = sc.nextLine();
        String address = sc.nextLine();
        String gender = sc.nextLine();
        String course = sc.nextLine();
        String section = sc.nextLine();
        int fees = sc.nextInt();
        String date = sc.nextLine();
        String courseExam = sc.nextLine();

        Exam e1 = new Exam(id, name, address, gender, course, section, fees, date, courseExam);
        e1.displayperson();
        e1.displayStudent();
        e1.displayExam();

        sc.close();

    }
}
