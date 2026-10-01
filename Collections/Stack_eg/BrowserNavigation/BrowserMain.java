package Collections.Stack_eg.BrowserNavigation;

public class BrowserMain {
    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory();
        browser.visit(new BrowserPage("https://www.redbus.in", "RedBUS"));
        browser.visit(new BrowserPage("https://www.sevenmentor.com", "Sevenmentor"));
        browser.visit(new BrowserPage("https://www.irctc.com", "TRCTC"));
        browser.visit(new BrowserPage("https://www.samsung.in", "Samsung Mobile"));
        browser.visit(new BrowserPage("https://www.bookmyshow.in", "BookMyShow"));

        browser.displayHistory();

        System.out.println("\nCurrent Page");
        browser.currentPage();

        browser.back();
        System.out.println("\nCurrent Page");
        System.out.println(browser.currentPage());

        browser.back();
        System.out.println("\nCurrent Page");
        System.out.println(browser.currentPage());

        browser.back();
        System.out.println("\nCurrent Page");
        System.out.println(browser.currentPage());
    }

}
