package Multithreading.WaitDemo;

public class Shared {

    synchronized void waitingMehtod() {
        try {
            System.out.println("Thread is waiting....");
            wait();

            System.out.println("Thread Resumed....");
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            notify();
        }
    }

}
