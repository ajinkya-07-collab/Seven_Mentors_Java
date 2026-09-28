public class JoinMain {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Started");

        MyThread t1 = new MyThread();
        t1.start();

        t1.join(); // tells to wait other threads untill it completes its task

        System.out.println("Main Completed");
    }

}
