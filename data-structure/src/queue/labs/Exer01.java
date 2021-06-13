package queue.labs;

import queue.Queue;
import queue.entities.ListPrint;

public class Exer01 {
    public static void main(String[] args) {

        Queue<ListPrint> queue = new Queue<>();

        queue.push(new ListPrint("A", 1));
        queue.push(new ListPrint("B", 2));
        queue.push(new ListPrint("C", 3));
        queue.push(new ListPrint("D", 4));
        queue.push(new ListPrint("E", 7));
        queue.push(new ListPrint("F", 9));

        while(!queue.isEmpty()) {
            ListPrint listPrint = queue.remove();
            System.out.println("Print document ... " + listPrint.getName());
            try {
                Thread.sleep(300 * listPrint.getNumSheet());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("All documents have been printed");
    }
}
