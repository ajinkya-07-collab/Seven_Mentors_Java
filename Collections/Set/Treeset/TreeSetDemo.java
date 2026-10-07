package Collections.Set.Treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(70);
        numbers.add(20);
        numbers.add(50);
        numbers.add(90);
        numbers.add(100);
        numbers.add(10);
        numbers.add(70);
        numbers.add(65);

        System.out.println(numbers);
    }
}
