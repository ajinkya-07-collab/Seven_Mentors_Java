package Collections.Set.HashSet;

public class VisitorMain {

    private static void recordVisit(VisitorTracker tracker, String userId) {
        boolean newVisitor = tracker.recordVisit(userId);

        if (newVisitor) {
            System.out.println(userId + "-> New Visitor");
        } else {
            System.out.println(userId + "-> Returning Visitor");
        }
    }

    public static void main(String[] args) {
        VisitorTracker tracker = new VisitorTracker();

        recordVisit(tracker, "USER101");
        recordVisit(tracker, "USER102");
        recordVisit(tracker, "USER103");
        recordVisit(tracker, "USER104");
        recordVisit(tracker, "USER101");
        recordVisit(tracker, "USER102");

        tracker.displayVisitors();

        System.out.println("\nUnique Visitor Count : " + tracker.getUniqueVisitorCount());
        System.out.println("\nHas USER101 visited ?");
        System.out.println(tracker.hasVisited("USER101"));
        System.out.println("\nHas USER102 visited ?");
        System.out.println(tracker.hasVisited("USER102"));

    }

}
