package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment = new Date();
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    //Constructors

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }


    //GETTERS AND SETTERS
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

    public List<OrderItem> getItems() {
        return items;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    //METHODS
    public double total(){
        double total=0;

        for (OrderItem o : items){
            total += o.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: ");
        sb.append(moment).append("\n");
        sb.append("Order status: ");
        sb.append(status).append("\n");
        sb.append("Client: ");
        sb.append(client.getName()).append(" ");
        sb.append("(").append(client.getBirthDate()).append(") ");
        sb.append(" - ").append(client.getEmail()).append("\n");
        sb.append("Order items: \n");
        for (OrderItem o : items){
            sb.append(o).append('\n');
        }
        sb.append("Total price: ").append(total());
        return sb.toString();
    }
}
