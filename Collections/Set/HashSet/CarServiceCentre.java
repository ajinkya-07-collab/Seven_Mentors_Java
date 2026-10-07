package Collections.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class CarServiceCentre {

    private Set<String> servicedCars = new HashSet<>();

    public boolean registerCar(String carNumber) {
        return servicedCars.add(carNumber);
    }

    public int getTotalCars() {
        return servicedCars.size();
    }

    public boolean hasCarVisited(String carNumber) {
        return servicedCars.contains(carNumber);
    }

    public void displayCars() {
        System.out.println("Cars Registered : ");

        for (String car : servicedCars) {
            System.out.println(car);
        }
    }
}