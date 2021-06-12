package queue;

import base.StaticStruct;

public class Queue<T> extends StaticStruct<T> {

    public Queue(){}

    public Queue(int capacity) {
        super(capacity);
    }

    public void push(T element) {
        this.add(element);
    }

    public T peek() {
        if (this.isEmpty()) {
            return null;
        }

        return this.elements[0];
    }

    public T remove() {
        final int POSITION = 0;

        if (this.isEmpty()){
            return null;
        }

        T elementRemoved = this.elements[POSITION];

        this.remove(POSITION);

        return elementRemoved;
    }
}
