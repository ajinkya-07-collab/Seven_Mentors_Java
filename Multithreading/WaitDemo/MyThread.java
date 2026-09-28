package Multithreading.WaitDemo;

public class MyThread extends Thread {

    Shared shared;

    public MyThread(Shared shared) {

        this.shared = shared;
    }

    public void run() {
        shared.waitingMehtod();
    }

}
