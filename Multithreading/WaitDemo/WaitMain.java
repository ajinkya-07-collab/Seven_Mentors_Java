package Multithreading.WaitDemo;

public class WaitMain {

    public static void main(String[] args) throws InterruptedException {

        Shared shared = new Shared();
        MyThread t1 = new MyThread(shared);
        t1.start();

        // Thread.sleep(2000);

        synchronized (shared) {
            shared.notify();
        }

    }

}
