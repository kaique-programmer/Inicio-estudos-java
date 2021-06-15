package queue.labs;

import queue.QueueWithPriority;
import queue.entities.Patient;

import java.util.Random;

public class MedicalCenterNewPatient implements Runnable{
    private QueueWithPriority<Patient> queue;
    private int cont = 7;
    private Random priority = new Random();

    public MedicalCenterNewPatient(QueueWithPriority<Patient> queue) {
    }

    public MedicalCenterNewPatient(QueueWithPriority<Patient> queue, int cont, Random priority) {
        this.queue = queue;
        this.cont = cont;
        this.priority = priority;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(8000);
                Patient patient = new Patient("" + cont, priority.nextInt(3));
                queue.push(patient);
                cont++;
                System.out.println(patient + " stacked.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
