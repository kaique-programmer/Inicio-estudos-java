package entities;

import java.sql.Struct;
import java.util.Arrays;

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
        if(this.length < this.elements.length) {
            this.elements[this.length] = element;
            this.length++;
            return true;
        }
        return false;
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
