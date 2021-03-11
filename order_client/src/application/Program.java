package application;

import model.entities.enums.OrderStatus;
import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String clientName = sc.nextLine();

        System.out.print("Email: ");
        String clientEmail = sc.nextLine();

        System.out.print("Birth Date (DD:MM/YYYY): ");
        Date clientBirthDate = simpleDateFormat.parse(sc.nextLine());

        Client clientClass = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), orderStatus, clientClass);

        System.out.print("How many items to this order? ");
        int itemQuantity = sc.nextInt();

        for (int i = 0; i < itemQuantity; i++) {
            System.out.println("Enter #" + i + " item data: ");
            sc.nextLine();
            System.out.print("Product Name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);
        sc.close();
    }
}
