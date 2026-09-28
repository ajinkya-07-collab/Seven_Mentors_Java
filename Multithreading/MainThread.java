package Multithreading;

public class MainThread {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        MyThread1 t1 = new MyThread1(resource, "Thread A");
        MyThread1 t2 = new MyThread1(resource, "Thread B");

        t1.start();
        t2.start();
    }

}
