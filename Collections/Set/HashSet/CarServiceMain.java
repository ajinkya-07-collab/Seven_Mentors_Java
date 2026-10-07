package Collections.Set.HashSet;

public class CarServiceMain {

    private static void registerCar(CarServiceCentre centre, String carNumber) {

        boolean newCar = centre.registerCar(carNumber);

        if (newCar) {
            System.out.println(carNumber + " -> New Car");
        } else {
            System.out.println(carNumber + " -> Returning Car");
        }
    }

    public static void main(String[] args) {

        CarServiceCentre centre = new CarServiceCentre();

        registerCar(centre, "MH12AB1234");
        registerCar(centre, "MH14CD5678");
        registerCar(centre, "MH12XY1111");
        registerCar(centre, "MH12AB1234");
        registerCar(centre, "MH14CD5678");

        centre.displayCars();

        System.out.println("\nTotal Unique Cars : "
                + centre.getTotalCars());

        System.out.println("\nHas MH12AB1234 visited?");
        System.out.println(
                centre.hasCarVisited("MH12AB1234"));

        System.out.println("\nHas MH20ZZ9999 visited?");
        System.out.println(
                centre.hasCarVisited("MH20ZZ9999"));
    }
}