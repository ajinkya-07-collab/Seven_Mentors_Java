package OOPs.Inheritance;

public class Person {
    // data member
    int id;
    String name;
    String address;
    String gender;

    // constructor
    public Person(int id, String name, String address, String gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    // member function
    public void displayperson() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Gender : " + gender);
    }

}
