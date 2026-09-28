package Multithreading;

public class MyThreadDem extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread");
        MyThreadDem mt = new MyThreadDem();
        MyThreadDem mt1 = new MyThreadDem();

        mt.setName("Thread 1");
        mt1.setName("Thread 2");
        mt.start();
        System.out.println(mt.getPriority());
        Thread.sleep(2000);

        mt1.setPriority(MAX_PRIORITY);
        System.out.println(mt1.getPriority());
        mt1.start();

        System.out.println(mt.getName());
        System.out.println(mt1.getName());

    }

}
