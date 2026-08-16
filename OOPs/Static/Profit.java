package OOPs.Static;

public class Profit {

    int id;
    String name;
    double bill;
    static double profit = 0.3;

    public Profit(int id, String name, double bill) {
        this.id = id;
        this.name = name;
        this.bill = bill;
    }

    public void display() {
        System.out.println("*******Company Bill*****");
        System.out.println("Customer ID : " + id);
        System.out.println("Customer Name : " + name);
        System.out.println("Actual Bill : " + (bill - bill * profit));
        System.out.println("Total Bill " + bill);
        System.out.println("My Profit : " + profit * bill);
    }

    public static void main(String[] args) {

        Profit p1 = new Profit(1, "Name", 3000);
        p1.display();

    }

}
