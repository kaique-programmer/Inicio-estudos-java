package labs;

import model.entities.Contact;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer07 extends Exer06{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // variables

        ArrayList<Contact> ArrayList = new ArrayList<>(20); // array 20 capacity
        ArrayList<Contact> arrayList = new ArrayList<>();
        createContactDynamic(5, ArrayList);

        int option = 1;

        while (option != 0) {
            option = getOptionsMenu(scanner);

            switch (option) {
                case 1:
                    addContactFinal(scanner, ArrayList);
                    break;
                case 2:
                    addContactPosition(scanner, ArrayList);
                    break;
                case 3:
                    getContactPosition(scanner, ArrayList);
                    break;
                case 4:
                    getContact(scanner, arrayList);
                    break;
                case 5:
                    searchLastIndex(scanner, ArrayList);
                    break;
                case 6:
                    searchContactExist(scanner, ArrayList);
                    break;
                case 7:
                    deleteByPosition(scanner, ArrayList);
                    break;
                case 8:
                    deleteContact(scanner, ArrayList);
                    break;
                case 9:
                    printSizeArray(ArrayList);
                    break;
                case 10:
                    clearArray(ArrayList);
                    break;
                case 11:
                    printArray(ArrayList);
                    break;
                default:
                    break;
            }

        }

        System.out.println("User entered 0, finished program");
    }

    protected static void printArray(ArrayList<Contact> list){
        System.out.println(list);
    }

    protected static void clearArray(ArrayList<Contact> list){
        list.clear();
        System.out.println("All array contacts have been deleted.");
    }

    protected static void printSizeArray(ArrayList<Contact> list){
        System.out.println("Array size is: " + list.size());
    }

    protected static void deleteContact(Scanner scanner, ArrayList<Contact> list){

        int position = readDataInt("Enter the position to be searched", scanner);

        try {

            Contact contact = list.get(position);

            list.remove(contact);

            System.out.println("Contact deleted");

        } catch (Exception e) {
            System.out.println("Invalid position!");
        }
    }

    protected static void deleteByPosition(Scanner scanner, ArrayList<Contact> list){

        int position = readDataInt("Enter the position to be searched", scanner);

        try {

            list.remove(position);

            System.out.println("Contact deleted");

        } catch (Exception e) {
            System.out.println("Invalid position!");
        }
    }

    protected static void searchContactExist(Scanner scanner, ArrayList<Contact> list){

        int position = readDataInt("Enter the position to be searched", scanner);

        try {

            Contact contact = list.get(position);

            boolean exist = list.contains(contact);

            if (exist){
                System.out.println("Contact exist, follow data:");
                System.out.println(contact);
            } else {
                System.out.println("Contact no exist");
            }

        } catch (Exception e) {
            System.out.println("Invalid position!");
        }
    }

    protected static void searchLastIndex(Scanner scanner, ArrayList<Contact> list){

        int position = readDataInt("Enter the position to be searched", scanner);

        try {

            Contact contact = list.get(position);

            System.out.println("Contact exist, follow data:");
            System.out.println(contact);

            System.out.println("Searching for the contact found:");
            position = list.lastIndexOf(contact);

            System.out.println("Contact found in position " + position);

        } catch (Exception e) {
            System.out.println("Invalid position!");
        }
    }

    protected static void getContact(Scanner scanner, ArrayList<Contact> list){

        int position = readDataInt("Enter the position to be searched", scanner);

        try {

            Contact contact = list.get(position);

            System.out.println("Contact exist, follow data:");
            System.out.println(contact);

            System.out.println("Searching for the contact found:");
            position = list.indexOf(contact);

            System.out.println("Contact found in position " + position);

        } catch (Exception e) {
            System.out.println("Invalid position!");
        }
    }

    protected static void getContactPosition(Scanner scanner, ArrayList<Contact> list){

        int position = readDataInt("Enter the position to be searched", scanner);

        try {

            Contact contact = list.get(position);

            System.out.println("Contact exist, follow data:");
            System.out.println(contact);

        } catch (Exception e) {
            System.out.println("Invalid position!");
        }
    }

    protected static void addContactFinal(Scanner scanner, ArrayList<Contact> ArrayList) {

        System.out.println("Creating contact, enter data: ");
        String name = readData("Input with name", scanner);
        String phone = readData("Enter with phone", scanner);
        String email = readData("Enter with email", scanner);

        Contact contact = new Contact(name, phone, email);

        ArrayList.add(contact);

        System.out.println("Contact added with success!");
        System.out.println(contact);
    }

    protected static void addContactPosition(Scanner scanner, ArrayList<Contact> ArrayList) {

        System.out.println("Creating contact, enter data: ");
        String name = readData("Input with name", scanner);
        String phone = readData("Enter with phone", scanner);
        String email = readData("Enter with email", scanner);

        Contact contact = new Contact(name, phone, email);



        ArrayList.add(contact);

        System.out.println("Contact added with success!");
        System.out.println(contact);
    }

    protected static void createContactDynamic(int quantity, ArrayList<Contact> ArrayList) {

        Contact contact;

        for (int i = 0; i < quantity; i++) {
            contact = new Contact();
            contact.setName("Contact " + i);
            contact.setPhone("1111-1111" + i);
            contact.setEmail("Contact" + i + "@gmail.com");

            ArrayList.add(contact);
        }
    }
}
