package OOPs.Inheritance;

public class Exam extends Student {

    String date;
    String courseExam;

    public Exam(int id, String name, String address, String gender, String course, String section, int fees,
            String date, String courseExam) {
        super(id, name, address, gender, course, section, fees);
        this.date = date;
        this.courseExam = courseExam;
    }

    public void displayExam() {
        System.out.println("Exam Date : " + date);
        System.out.println("Exam Subject : " + courseExam);
    }

}
