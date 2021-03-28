package entities;

public class Array {

    private String[] elements;
    private int length;

    public Array(int capacity) {
        this.elements = new String[capacity];
        this.length = 0;
    }

    /*public void add(String element) {
        for (int i =0; i < this.elements.length; i++) {
            if (this.elements[i] == null) {
                this.elements[i] = element;
                break;
            }
        }
    }*/

    /*public void add(String element) throws Exception {
        if(this.length < this.elements.length){
            this.elements[this.length] = element;
            this.length++;
        }else
            throw new Exception("Array already fill, isn't possible add more elements.");
    }*/

    public boolean add(String element) {
        increaseCapacity();
        if(this.length < this.elements.length) {
            this.elements[this.length] = element;
            this.length++;
            return true;
        }
        return false;
    }

    public boolean add(int position, String element) {
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
            String[] newElements = new String[this.elements.length * 2];
            for (int i =0; i < this.elements.length; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public String search(int position) {
        if(!(position >= 0 && position < length)) {
            throw new IllegalArgumentException("Invalid position");
        }
        return elements[position];
    }

    public int search(String element) {
        for (int i=0; i < this.length; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
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
