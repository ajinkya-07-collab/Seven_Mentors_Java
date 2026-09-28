package Multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {

        // Create a thread pool containing 3 threads - preusable/worker threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 5 tasks
        for (int i = 1; i <= 9; i++) {
            int taskId = i;

            executor.execute(() -> {
                System.out.println(
                        "Task " + taskId + " executed by "
                                + Thread.currentThread().getName());
            });
        }

        // Stop accepting new tasks and shut down after
        // submitted tasks finish
        executor.shutdown();

        // Simple explanation
        // executor is an ExecutorService object.
        // Its execute()/[submit()-additonally retuens fuutre object] method accepts a
        // Runnable object.
        // Runnable is a functional interface because it has only one abstract method:
        // run().
        // Therefore, we can use a lambda expression instead of creating a separate
        // class implementing Runnabl
    }
}
