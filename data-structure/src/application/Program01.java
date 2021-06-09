package application;

import model.entities.ObjectArray;
import model.entities.Contact;

public class Program01 {
    public static void main(String[] args) {

        ObjectArray objectArray = new ObjectArray(3);

        Contact c1 = new Contact("Contact 1", "6268-5892", "contact1@gmail.com");
        Contact c2 = new Contact("Contact 2", "7268-5892", "contact2@gmail.com");
        Contact c3 = new Contact("Contact 3", "8268-5892", "contact3@gmail.com");

        objectArray.add(c1);
        objectArray.add(c2);
        objectArray.add(c3);

        System.out.println("Length = " + objectArray.length());

        int position = objectArray.search(c1);
        if (position > -1) {
            System.out.println("Element exist in the array");
        } else {
            System.out.println("Element not exist in the array");
        }

        System.out.println(objectArray);
    }
}
