package OOPs.Inheritance;

public class Student extends Person {

    String course;
    String section;
    int fees;

    public Student(int id, String name, String address, String gender, String course, String section, int fees) {
        super(id, name, address, gender);
        this.course = course;
        this.section = section;
        this.fees = fees;
    }

    public void displayStudent() {
        System.out.println("Course : " + course);
        System.out.println("Class : " + section);
        System.out.println("Fees : " + fees);
    }

}
