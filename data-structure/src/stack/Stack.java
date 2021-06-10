package stack;

import base.StaticStruct;

public class Stack<T> extends StaticStruct<T> {

    public Stack() {super();}

    public Stack(int capacity) {
        super(capacity);
    }

    public void push(T element) {
        super.add(element);
    }

    public T top() {
        if (this.isEmpty()) {
            return null;
        }

        return this.elements[length-1];
    }

    public T pop() {
        if (this.isEmpty()) {
            return null;
        }

        return this.elements[--length];
    }
}
