package Multithreading.YeildDemo;

public class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName() + " : " + i);

            Thread.yield();// "I'm currently running, but other threads can get a chance to execute."
        }
    }

}
