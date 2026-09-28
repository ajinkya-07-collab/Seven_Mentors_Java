package Multithreading.RunnableInterface;

public class TaskMain {

    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread t1 = new Thread(task);
        t1.start();
    }

}
