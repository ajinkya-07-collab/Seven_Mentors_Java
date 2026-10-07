package Collections.Set;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> number = new HashSet<>();

        number.add(100);
        number.add(200);
        number.add(300);
        number.add(100);
        number.add(null);
        number.add(200);
        number.add(400);
        number.add(null);

        System.out.println(number);
    }

}
