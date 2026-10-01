package Collections.Queue_eg;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();

        // add()/offer()
        queue.offer("Customer - 101");
        queue.offer("Customer - 102");
        queue.offer("Customer - 103");
        queue.offer("Customer - 104");
        queue.offer("Customer - 105");

        System.out.println("Queue");
        System.out.println(queue);

        System.out.println("Next Customer : ");
        System.out.println(queue.element());

        System.out.println("Removing Customer : ");
        System.out.println(queue.poll()); // also remove()/poll()

        System.out.println("Next Customer : ");
        System.out.println(queue.peek()); // element()/peek()

        queue.removeAll(queue);
        // queue.remove();
        // queue.element(); --- both give excetipn
    }
}
