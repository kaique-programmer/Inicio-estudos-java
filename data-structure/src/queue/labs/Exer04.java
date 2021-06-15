package queue.labs;

import queue.Queue;

import java.util.Random;

public class Exer04 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        for (int i=0; i<10; i++) {
            queue.push(i);
        }

        Random random = new Random();
        int num = 0;
        while (num == 0) {
            num = random.nextInt(10);
        }

        System.out.println("Number = " + num);

        while (queue.length() > 1) {
            for (int i=0; i<num; i++) {
                queue.push(queue.remove());
            }
            System.out.println("Eliminated = " + queue.remove());
        }

        System.out.println("Winner: " + queue.remove());
    }
}
