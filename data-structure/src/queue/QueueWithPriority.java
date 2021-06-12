package queue;

public class QueueWithPriority<T> extends Queue<T> {

    public void push(T element) {
        Comparable<T> key = (Comparable<T>) element;

        int i;
        for(i=0; i < this.length; i++) {
            if (key.compareTo(this.elements[i]) < 0) {
                break;
            }
        }
        this.add(i, element);
    }
}
