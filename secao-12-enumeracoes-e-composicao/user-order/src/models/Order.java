package models;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    public Double total(){
        double soma = 0.0;
        for (OrderItem valor : items){
            soma += valor.subTotal();
        }
        return soma;
    }

    public void addItems(OrderItem item) {this.items.add(item);}

    public void removeItems(OrderItem item) {this.items.remove(item);}


    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus newStatus) {
        if (this.status.ordinal() <= newStatus.ordinal()){
            throw new IllegalArgumentException("A retrocedencia de status não é permitida");
        }
        this.status = newStatus;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY");
        sb.append("\nOrder moment: " + sdf.format(moment));
        sb.append("\nOrder status: " + status);
        sb.append("\nClient: " + this.getClient());
        sb.append("\nOrder items: \n");

        for (OrderItem i: items){
            sb.append(i + "\n");
        }

        sb.append("\nTotal price: $" + total());

        return sb.toString();
    }
}
