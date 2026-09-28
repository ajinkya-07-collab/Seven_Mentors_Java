package Multithreading.Practice;

public class MyThread extends Thread {
    SharedResource resource;

    public MyThread(SharedResource resource, String name) {
        super(name);
        this.resource = resource;
    }

    public void run() {
        resource.checkout();
    }

}
