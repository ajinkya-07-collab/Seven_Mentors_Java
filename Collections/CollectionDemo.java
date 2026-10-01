package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Pune");
        list.add("Mumbai");
        list.add("Nanded");
        list.add("Delhi");
        list.add(null);
        list.add("Satara");
        list.add("Delhi");
        list.add(null);
        list.add("Delhi");
        list.add(null);
        list.add("Delhi");

        System.out.println(list);

        // list.remove("Nanded"); // can use index also (index)
        // System.out.println(list);

        // System.out.println(list.size()); // 4

        // System.out.println(list.contains("Nanded")); // false

        // list.sort(null); // sort alphabetical
        // System.out.println(list);

        // Collections.sort(list);
        // System.out.println(list);

        // Collections.reverse(list);
        // System.out.println(list);

        // // Collections.shuffle(list);
        // System.out.println(Collections.max(list));
        // System.out.println(Collections.min(list));
        // // Collections.max(list);
        // // Collections.min(list);

        String cityname = list.get(5);
        System.out.println(cityname);

        list.add(7, "Nashik");

        System.out.print("[");
        for (String cName : list) {
            System.out.print(cName + ",");
        }
        System.out.print("]");

        System.out.println("\n" + list.size());

        // Replacing existing element (method : set(index,Value));
        list.set(3, "CHENNAI");
        System.out.println(list);

        // Remove
        list.remove(2);
        System.out.println(list.size());

        System.out.println(list);

        // find index
        System.out.println(list.indexOf("Delhi"));
        System.out.println(list.lastIndexOf("Delhi"));

    }

}
