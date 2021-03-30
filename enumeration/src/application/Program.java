package application;

import model.entities.enums.OrderStatus;
import entities_order.Order;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(2900, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus orderStatus01 = OrderStatus.DELIVERED;
        OrderStatus orderStatus02 = OrderStatus.valueOf("DELIVERED");
        System.out.println(orderStatus01);
        System.out.println(orderStatus02);
    }
}
