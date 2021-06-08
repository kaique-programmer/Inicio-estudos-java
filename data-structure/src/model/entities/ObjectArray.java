package model.entities;

public class ObjectArray {
    private Object[] elements;
    private int length;

    public ObjectArray(int capacity) {
        this.elements = new Object[capacity];
        this.length = 0;
    }

    public boolean add(Object element) {
        this.increaseCapacity();
        if(this.length < this.elements.length) {
            this.elements[this.length] = element;
            this.length++;
            return true;
        }
        return false;
    }

    public boolean add(int position, Object element) {
        if (!(position >= 0 && position < length)) {
            throw new IllegalArgumentException("Invalid position");
        }

        increaseCapacity();

        // move all elements
        for (int i = this.length-1; i >= position; i--) {
            this.elements[i+1] = this.elements[i];
        }
        this.elements[position] = element;
        this.length++;

        return true;
    }

    private void increaseCapacity() {
        if (this.length == this.elements.length) {
            Object[] newElements = new String[this.elements.length * 2];
            for (int i =0; i < this.elements.length; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public Object search(int position) {
        if(!(position >= 0 && position < length)) {
            throw new IllegalArgumentException("Invalid position");
        }
        return elements[position];
    }

    public int search(Object element) {
        for (int i=0; i < this.length; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int position) {
        if (!(position >= 0 && position < this.length)) {
            throw new IllegalArgumentException("Position invalid");
        }
        for (int i = position; i < this.length-1; i++) {
            this.elements[i] = this.elements[i+1];
        }
        this.length--;
    }

    public int length() {
        return this.length;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for(int i=0; i < this.length-1; i++) {
            stringBuilder.append(this.elements[i]);
            stringBuilder.append(", ");
        }
        if(this.length > 0)
            stringBuilder.append(this.elements[this.length-1]);

        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}