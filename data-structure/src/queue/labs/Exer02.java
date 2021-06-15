package queue.labs;

import queue.Queue;

public class Exer02 {
    public static void main(String[] args) {
        Queue<String> regular = new Queue<>();
        Queue<String> priority = new Queue<>();

        final int MAX_PRIORITY = 3;

        regular.push("Person 1");
        regular.push("Person 2");
        regular.push("Person 3");
        priority.push("Person 1P");
        priority.push("Person 2P");
        priority.push("Person 3P");
        priority.push("Person 4P");
        priority.push("Person 5P");
        regular.push("Person 4");
        regular.push("Person 5");
        regular.push("Person 6");
        regular.push("Person 7");
        regular.push("Person 8");

        while (!regular.isEmpty() || !priority.isEmpty()) {

            int cont = 0;

            while(!priority.isEmpty() && cont < MAX_PRIORITY) {
                answerPerson(priority);
                cont++;
            }

            if (!regular.isEmpty()) {
                answerPerson(regular);
            }

            if (priority.isEmpty()) {
                while (!regular.isEmpty()) {
                    answerPerson(regular);
                }
            }
        }
    }

    public static void answerPerson(Queue<String> queue) {
        String personAnswered = queue.remove();
        System.out.println(personAnswered + " was answered.");
    }

}
