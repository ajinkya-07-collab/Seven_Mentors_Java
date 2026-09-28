package Multithreading.Practice;

public class MainThread {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        MyThread t1 = new MyThread(resource, "Thread A");
        MyThread t2 = new MyThread(resource, "Thread B");

        t1.start();
        t2.start();
    }

}
