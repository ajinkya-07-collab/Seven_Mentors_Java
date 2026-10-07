package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "Amol");
        employees.put(102, "Arun");
        employees.put(103, "Tushar");
        employees.put(104, "Arun");

        System.out.println("Employee : 104 " + employees.get(104));
        System.out.println("Removing Employee 103 : " + employees.remove(103));
        System.out.println(employees.containsKey(103));
        System.out.println(employees.containsValue("Amol"));

        System.out.println(employees.size());

        System.out.println(employees.isEmpty());

        employees.putIfAbsent(108, "Nitin");
        System.out.println(employees.containsKey(108));

    }
}
