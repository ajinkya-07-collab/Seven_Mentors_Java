package PredefinedMethods;

class Person {

    int id;

    public Person(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {

        Person p = (Person) obj;

        return this.id == p.id;

    }
}

public class ObjMethods {

    public static void main(String[] args) {

        Person p1 = new Person(101);
        Person p2 = new Person(101);

        System.out.println(p1.equals(p2));

        // Person p1 = new Person();

        // System.out.println(p1.toString());

        // System.out.println(p1.hashCode());

        // System.out.println(p1.getClass());

        // Person p2 = new Person();

        // System.out.println(p1.equals(p2));

        // System.out.println(p2.hashCode());

    }
}
