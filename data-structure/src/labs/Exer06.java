package labs;

import model.entities.Contact;
import model.entities.ListStruct;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // variables

        ListStruct<Contact> listStruct = new ListStruct<>(20); // array 20 capacity
        ArrayList<Contact> arrayList = new ArrayList<>();
        createContactDynamic(5, listStruct);

        int option = 1;

        while (option != 0) {
            option = getOptionsMenu(scanner);

            switch (option) {
                case 1:
                    addContactFinal(scanner, listStruct);
                    break;
                case 2:
                    addContactPosition(scanner, listStruct);
                    break;
                case 3:
                    getContactPosition(scanner, listStruct);
                    break;
                case 4:
                    getContact(scanner, arrayList);
                    break;
                case 5:
                    searchLastIndex(scanner, listStruct);
                    break;
                case 6:
                    searchContactExist(scanner, listStruct);
                    break;
                case 7:
                    deleteByPosition(scanner, listStruct);
                    break;
                case 8:
                    deleteContact(scanner, listStruct);
                    break;
                case 9:
                    printSizeArray(listStruct);
                    break;
                case 10:
                    clearArray(listStruct);
                    break;
                case 11:
                    printArray(listStruct);
                    break;
                default:
                    break;
            }

        }

        System.out.println("User entered 0, finished program");
    }

    public static int getOptionsMenu(Scanner scanner) {

        boolean inputValid = false;
        int option = 0;
        String input = "";

        while (!inputValid) {

            System.out.println("Enter the wish option: ");
            System.out.println("1: Adds contact at the end of the vector");
            System.out.println("2: Adds a contact at a specific position");
            System.out.println("3: Gets contact from a specific position");
            System.out.println("4: Search contact");
            System.out.println("5: Search last contact index");
            System.out.println("6: Checks if contact exists");
            System.out.println("7: Delete by position");
            System.out.println("8: Delete contact");
            System.out.println("9: Check vector size");
            System.out.println("10: Delete all contacts from the vector");
            System.out.println("11: Print vector");
            System.out.println("0: Exit");

            try{
                input = scanner.nextLine();
                option = Integer.parseInt(input);
                if (option >= 0 && option <= 11) {
                    inputValid = true;
                } else {
                    throw new Exception();
                }
            }
            catch (Exception e) {
                System.out.println("Input invalid! Enter again");
            }
        }

        return option;
    }

    private static String readData(String message, Scanner scanner) {

        System.out.println(message);
        String input = scanner.nextLine();

        return input;
    }

    private static int readDataInt(String message, Scanner scanner) {

        boolean inputValid = false;
        int num = 0;

        while (!inputValid) {
            try {
                System.out.println(message);
                String input = scanner.nextLine();

                num = Integer.parseInt(input);

                inputValid = true;
            } catch(Exception e) {
                System.out.println("Input invalid! enter again");
            }
        }

        return num;
    }

    private static void printArray(ListStruct<Contact> list){
        System.out.println(list);
    }

    private static void clearArray(ListStruct<Contact> list){
        list.clear();
        System.out.println("All array contacts have been deleted.");
    }

    private static void printSizeArray(ListStruct<Contact> list){
        System.out.println("Array size is: " + list.length());
    }

    private static void deleteContact(Scanner scanner, ListStruct<Contact> list){

        int position = readDataInt("Enter the position to be searched", scanner);

        try {

            Contact contact = list.get(position);

            list.remove(contact);

            System.out.println("Contact deleted");

        } catch (Exception e) {
            System.out.println("Invalid position!");
        }
    }

    private static void deleteByPosition(Scanner scanner, ListStruct<Contact> list){

        int position = readDataInt("Enter the position to be searched", scanner);

        try {

            list.remove(position);

            System.out.println("Contact deleted");

        } catch (Exception e) {
            System.out.println("Invalid position!");
        }
    }

    private static void searchContactExist(Scanner scanner, ListStruct<Contact> list){

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

    private static void searchLastIndex(Scanner scanner, ListStruct<Contact> list){

        int position = readDataInt("Enter the position to be searched", scanner);

        try {

            Contact contact = list.get(position);

            System.out.println("Contact exist, follow data:");
            System.out.println(contact);

            System.out.println("Searching for the contact found:");
            position = list.lastIndex(contact);

            System.out.println("Contact found in position " + position);

        } catch (Exception e) {
            System.out.println("Invalid position!");
        }
    }

    private static void getContact(Scanner scanner, ArrayList<Contact> list){

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

    private static void getContactPosition(Scanner scanner, ListStruct<Contact> list){

        int position = readDataInt("Enter the position to be searched", scanner);

        try {

            Contact contact = list.get(position);

            System.out.println("Contact exist, follow data:");
            System.out.println(contact);

        } catch (Exception e) {
            System.out.println("Invalid position!");
        }
    }

    private static void addContactFinal(Scanner scanner, ListStruct<Contact> listStruct) {

        System.out.println("Creating contact, enter data: ");
        String name = readData("Input with name", scanner);
        String phone = readData("Enter with phone", scanner);
        String email = readData("Enter with email", scanner);

        Contact contact = new Contact(name, phone, email);

        listStruct.add(contact);

        System.out.println("Contact added with success!");
        System.out.println(contact);
    }

    private static void addContactPosition(Scanner scanner, ListStruct<Contact> listStruct) {

        System.out.println("Creating contact, enter data: ");
        String name = readData("Input with name", scanner);
        String phone = readData("Enter with phone", scanner);
        String email = readData("Enter with email", scanner);

        Contact contact = new Contact(name, phone, email);



        listStruct.add(contact);

        System.out.println("Contact added with success!");
        System.out.println(contact);
    }

    private static void createContactDynamic(int quantity, ListStruct<Contact> listStruct) {

        Contact contact;

        for (int i = 0; i < quantity; i++) {
            contact = new Contact();
            contact.setName("Contact " + i);
            contact.setPhone("1111-1111" + i);
            contact.setEmail("Contact" + i + "@gmail.com");

            listStruct.add(contact);
        }
    }
}
