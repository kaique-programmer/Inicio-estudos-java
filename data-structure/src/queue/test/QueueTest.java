package queue.test;

import queue.Queue;

public class QueueTest {
    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        System.out.println(queue.isEmpty());
        System.out.println(queue.length());


        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        System.out.println(queue.isEmpty());
        System.out.println(queue.length());

        System.out.println(queue.toString());
    }
}
