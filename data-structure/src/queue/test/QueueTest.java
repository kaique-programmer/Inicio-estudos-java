package queue.test;

import queue.Queue;

public class QueueTest {
    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        /* push
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        System.out.println(queue.isEmpty());
        System.out.println(queue.length());

        System.out.println(queue.toString());*/

        /* peek
        queue.push(2);
        queue.push(1);
        queue.push(3);

        System.out.println(queue.peek());
        System.out.println(queue.toString());
         */

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue);

        System.out.println(queue.remove());

        System.out.println(queue);

        System.out.println(queue.remove());

        System.out.println(queue);

        System.out.println(queue.remove());

        System.out.println(queue);
    }
}
