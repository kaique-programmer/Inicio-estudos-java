package queue.test;

import queue.Queue;

public class QueueTest {
    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        System.out.println(queue.isEmpty());
        System.out.println(queue.length());

    }
}
