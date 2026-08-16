package OOPs.Static;

public class Student {

    static {
        System.out.println("This is static Block");
        int a = 20;
        int b = 30;
        int c = a + b;
        System.out.println(c);
    }

    int id;
    String name;
    String address;
    String gender;
    static String collegeName = "MIT Pune";
    static String course = "Full Stack";

    public Student(int id, String name, String gender, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    void changeName() {
        collegeName = "SCOE";
        course = "Java Full Stack";
    }

    public void display() {
        System.out.println("Student Information : ");
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Gender : " + gender);
        System.out.println("College Name :" + collegeName);
        System.out.println("Course Name : " + course);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Amit", "Male", "Pune");
        s1.display();

        Student s2 = new Student(2, "Ravi", "Male", "Koregaon");
        s2.display();

        s2.changeName();

        Student s3 = new Student(1, "Amit", "Male", "Pune");
        s3.display();
    }
}
