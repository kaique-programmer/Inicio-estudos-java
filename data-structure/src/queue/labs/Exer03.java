package queue.labs;

import queue.QueueWithPriority;
import queue.entities.Patient;

public class Exer03 {

    public static final int GREEN = 2;
    public static final int YELLOW = 1;
    public static final int RED = 0;

    public static void main(String[] args) {

        QueueWithPriority<Patient> queue = new QueueWithPriority<>();
        queue.push(new Patient("1", GREEN));
        queue.push(new Patient("2", YELLOW));
        queue.push(new Patient("3", RED));
        queue.push(new Patient("4", GREEN));
        queue.push(new Patient("5", GREEN));
        queue.push(new Patient("6", RED));

        MedicalCenterAnswer medicalCenterAnswer = new MedicalCenterAnswer(queue);
        MedicalCenterNewPatient medicalCenterNewPatient = new MedicalCenterNewPatient(queue);

        Thread t1 = new Thread(medicalCenterAnswer);
        Thread t2 = new Thread(medicalCenterNewPatient);

        t1.start();
        t2.start();
    }

}
