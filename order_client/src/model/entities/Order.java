package model.entities;

import model.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;

    List<OrderItem> orderItemList = new ArrayList<>();

    public Order(){}

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void addItem(OrderItem item) {
        this.orderItemList.add(item);
    }

    public void removeItem(OrderItem item) {
        this.orderItemList.remove(item);
    }

    public double total(){
        double sum = 0.0;
        for (OrderItem orderItem : orderItemList)
            sum += orderItem.subTotal();

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Order moment: ");
        stringBuilder.append(simpleDateFormat.format(this.moment) + "\n");
        stringBuilder.append("Order status: ");
        stringBuilder.append(this.status + "\n");
        stringBuilder.append("Client: ");
        stringBuilder.append(this.client + "\n");
        stringBuilder.append("order items:\n");
        for(OrderItem orderItem : orderItemList)
            stringBuilder.append(orderItem + "\n");

        stringBuilder.append("Total price: $");
        stringBuilder.append(String.format("%.2f", total()));
        return stringBuilder.toString();
    }
}
