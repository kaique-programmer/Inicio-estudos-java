package array;

import base.StaticStruct;

public class List<T> extends StaticStruct<T> {

    public List(){
        super();
    }

    public List(int capacity){
        super(capacity);
    }

    public boolean add(T element) {
        return super.add(element);
    }

    public boolean add(int position, T element) {
        return super.add(position, element);
    }
}
