package queue.test;

import queue.QueueWithPriority;
import queue.entities.Patient;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueWithPriorityTest {
    public static void main(String[] args) {

        /*QueueWithPriority<Patient> queue = new QueueWithPriority<>();

        queue.push(new Patient("A", 2));
        queue.push(new Patient("C", 1));
        queue.push(new Patient("B", 3));

        System.out.println(queue); //1 2 3 e nao 1 3 2

        System.out.println(queue.remove());

        System.out.println(queue);*/

        Queue<Patient> queueWithPriority = new PriorityQueue<>(
                new Comparator<Patient>() {
                    @Override
                    public int compare(Patient patient1, Patient patient2) {
                        return Integer.valueOf(patient1.getPriority()).compareTo(patient2.getPriority());
                    }
                }
        );

        queueWithPriority.add(new Patient("A", 2));
        queueWithPriority.add(new Patient("B", 1));

        System.out.println(queueWithPriority);
    }
}
