package Enum;

enum Day {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}

enum Colors {
    Red,
    Green,
    Blue,
    Yellow,
    Orange,
    Black,
    White

}

public class EnumDemo {

    public static void main(String[] args) {

        Day day = Day.Sunday;
        Day day1 = day.Friday;

        if (day1 == day.Friday) {
            System.out.println("This Friday and Woking Day");
        }
        switch (day) {
            case Sunday:
                System.out.println("This is Sunday && Holiday");
                break;

            default:
                System.out.println("Invalid Day");
                break;
        }

        Colors[] color = Colors.values();

        for (Colors colors : color) {
            System.out.println(colors);
        }
    }

}
