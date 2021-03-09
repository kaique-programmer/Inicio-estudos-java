package application;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        // creates a new ArrayList of strings with an initial capacity of 10
        ArrayList<String> items = new ArrayList<String>();

        items.add("red"); // appends an item to the list
        items.add(0, "yellow"); // inserts "yellow" at index 0

        // header
        System.out.print("Display list contents with counter-controlled loop: ");

        // displays the colors in the list
        for(int i =0; i < items.size(); i++)
            System.out.printf(" %s", items.get(i));

        // displays the colors using enhanced for in the display method
        display(items, "%nDisplay list contents with enhanced for statement:");

        items.add("green"); // add "green" to the end of the list
        items.add("yellow");
        display(items, "List with two new elements:");

        items.remove("yellow"); // remove the first "yellow"
        display(items, "Remove first instance of yellow:");

        items.remove(1); // remove the item in the index 1
        display(items, "Remove second list element (green):");

        // checks if a value is in the List
        System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "" : "not");

        // displays the number of elements in the List
        System.out.printf("Size: %s%n", items.size());
    }

    // displays ArrayList elements on the console
    public static void display(ArrayList<String> items, String header) {
        System.out.printf(header); // display the header

        // displays each element in the items
        for(String item : items)
            System.out.printf(" %s", item);

        System.out.println();
    }
}
