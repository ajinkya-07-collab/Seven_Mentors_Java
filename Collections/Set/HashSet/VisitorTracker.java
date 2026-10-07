package Collections.Set.HashSet;

import java.util.*;

public class VisitorTracker {

    private Set<String> uniqueVisitors = new HashSet<>();

    public boolean recordVisit(String userId) {
        return uniqueVisitors.add(userId);

    }

    public int getUniqueVisitorCount() {
        return uniqueVisitors.size();
    }

    public boolean hasVisited(String userId) {
        return uniqueVisitors.contains(userId);
    }

    public void displayVisitors() {
        System.out.println("Unique Visitors : ");
        for (String visitor : uniqueVisitors) {
            System.out.println(visitor);
        }
    }

}
