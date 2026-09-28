package Multithreading;

public class MyThread1 extends Thread {

    SharedResource resource;

    public MyThread1(SharedResource resource,
            String name) {

        super(name);
        this.resource = resource;

    }

    public void run() {
        resource.display();
    }

}
