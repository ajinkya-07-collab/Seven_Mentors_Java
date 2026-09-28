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
        list.add("Satara");

        System.out.println(list);

        list.remove("Nanded"); // can use index also (index)
        System.out.println(list);

        System.out.println(list.size()); // 4

        System.out.println(list.contains("Nanded")); // false

        list.sort(null); // sort alphabetical
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        // Collections.shuffle(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        // Collections.max(list);
        // Collections.min(list);

    }

}
