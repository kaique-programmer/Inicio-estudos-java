package queue.labs;

import queue.QueueWithPriority;
import queue.entities.Patient;

public class MedicalCenterAnswer implements Runnable {
    private QueueWithPriority<Patient> queue;

    public MedicalCenterAnswer(QueueWithPriority<Patient> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.remove() + " answered.");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
