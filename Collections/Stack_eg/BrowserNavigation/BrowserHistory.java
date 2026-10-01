package Collections.Stack_eg.BrowserNavigation;

import java.util.Stack;

public class BrowserHistory {

    private Stack<BrowserPage> history = new Stack<>();

    public void visit(BrowserPage page) {

        history.push(page);

        System.out.println("Visited" + page);

    }

    public BrowserPage back() {

        if (history.isEmpty()) {
            System.out.println("No Browsing History Available");

            return null;
        }

        BrowserPage page = history.pop();
        System.out.println("Going back from : " + page);

        return page;

    }

    public BrowserPage currentPage() {

        if (history.isEmpty()) {
            return null;
        }
        return history.peek();
    }

    public void displayHistory() {
        System.out.println("\nBrowser History : ");
        for (BrowserPage page : history) {
            System.out.println(page);
        }
    }

}
