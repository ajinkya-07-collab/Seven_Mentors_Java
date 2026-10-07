package Collections.Queue_eg.Deque;

import java.util.*;

public class DequeDemo {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>(); // can perform

        deque.add("Nagpur");
        deque.add("Latur");
        deque.add("Nanded");
        deque.add("Beed");

        System.out.println(deque);

        deque.addFirst("Pune");
        deque.addLast("Mumbai");

        System.out.println(deque);

        deque.addFirst("Satara");
        deque.addLast("Solapur");

        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        deque.pollFirst();
        System.out.println(deque);

        deque.pollLast();
        System.out.println(deque);

    }

}
