package base;

public class StaticStruct<T> {
    protected T[] elements;
    protected int length;

    public StaticStruct(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.length = 0;
    }

    public StaticStruct() {
        this(10);
    }

    protected boolean add(T element) {
        this.increaseCapacity();
        if (this.length < this.elements.length) {
            this.elements[this.length] = element;
            this.length++;
            return true;
        }
        return false;
    }

    public boolean add(int position, T element) {
        if (position < 0 || position > length) {
            throw new IllegalArgumentException("Invalid position");
        }

        increaseCapacity();

        // move all elements
        for (int i = this.length - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[position] = element;
        this.length++;

        return true;
    }

    private void increaseCapacity() {
        if (this.length == this.elements.length) {
            T[] newElements = (T[]) new String[this.elements.length * 2];
            for (int i = 0; i < this.elements.length; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    protected void remove(int position){
        if (!(position >= 0 && position < length)){
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int i=position; i<length-1; i++){
            elements[i] = elements[i+1];
        }
        length--;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int length() {
        return this.length;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.length - 1; i++) {
            stringBuilder.append(this.elements[i]);
            stringBuilder.append(", ");
        }
        if (this.length > 0)
            stringBuilder.append(this.elements[this.length - 1]);

        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
