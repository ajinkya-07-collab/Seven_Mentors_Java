package Collections.Set.LinkedHashSet;

import java.util.*;

public class TechnologySearchHistory {

    private Set<String> searches = new LinkedHashSet<>();

    public void search(String technology) {
        boolean newSearch = searches.add(technology);

        if (newSearch) {
            System.out.println("Added : " + technology);
        } else {
            System.out.println("Already Search : " + technology);
        }
    }

    public void displayHistory() {
        System.out.println("\nSearch History : ");
        for (String search : searches) {
            System.out.println(search);
        }
    }

    public static void main(String[] args) {
        TechnologySearchHistory history = new TechnologySearchHistory();

        history.search("Java");
        history.search("Python");
        history.search("DotNet");
        history.search("MERN");
        history.search("Java");
        history.search("Python");
        history.search("MERN");

        history.displayHistory();
    }
}
