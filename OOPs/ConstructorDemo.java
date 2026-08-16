
package OOPs;

import OOPs.Student;

class Student {
    int rollno;
    String name;
    String course;
    int fees;

    public Student() {
        System.out.println("Non-parameterised");
    }

    public Student(int rollno, String name, String course, int fees) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.fees = fees;

    }

    public Student(Student stud) {
        this.rollno = stud.rollno;
        this.name = stud.name;
        this.course = stud.course;
        this.fees = stud.fees;

    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Rollno : " + rollno);
        System.out.println("Course : " + course);
        System.out.println("Fees : " + fees);
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();

        Student s2 = new Student(1, "Ajinkya", "Java", 30000);
        s2.display();

        Student s3 = new Student(2, "Sakshi", "BParm", 3400);
        s3.display();

        Student s4 = new Student(s3);
        s4.display();

    }

}
