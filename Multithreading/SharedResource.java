package Multithreading;

public class SharedResource {

    synchronized void display() {
        System.out.println(Thread.currentThread().getName() + " Entered");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(Thread.currentThread().getName() + " completed");
    }

}
