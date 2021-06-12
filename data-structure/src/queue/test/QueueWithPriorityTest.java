package queue.test;

import queue.QueueWithPriority;
import queue.entities.Patient;

public class QueueWithPriorityTest {
    public static void main(String[] args) {

        QueueWithPriority<Patient> queue = new QueueWithPriority<>();

        queue.push(new Patient("A", 2));
        queue.push(new Patient("C", 1));
        queue.push(new Patient("B", 3));

        System.out.println(queue); //1 2 3 e nao 1 3 2

        System.out.println(queue.remove());

        System.out.println(queue);
    }
}
