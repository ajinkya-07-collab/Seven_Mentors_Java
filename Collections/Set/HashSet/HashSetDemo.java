package Collections.Set.HashSet;

import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("DotNet");
        skills.add("Mern");
        skills.add("Mean");
        skills.add("Java");
        skills.add(null);
        skills.add(null);
        skills.add("Python");

        System.out.println(skills);

        for (String skill : skills) {
            System.out.println(skill);
        }

        System.out.println(skills.contains("Java")); // true
    }

}
