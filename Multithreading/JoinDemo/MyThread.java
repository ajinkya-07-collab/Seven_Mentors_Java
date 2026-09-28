
public class MyThread extends Thread {

    public void run() {

        try {
            Thread.sleep(2000);
            System.out.println("Work Completed");

        } catch (Exception e) {

            Thread.currentThread().interrupt();
        }

    }
}
