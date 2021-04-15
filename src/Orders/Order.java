package Orders;

import java.util.ArrayList;

public class Order {

    //Attributes
    private String nameOfCustomer;
    private ArrayList<OrderLineItem> orderLineItems = new ArrayList<>();
    int totalPizzas;
    int deliveryTime;

    //Constructor
    public Order(String nameOfCustomer, ArrayList orderLineItems, int totalPizzas, int deliveryTime) {
        this.nameOfCustomer = nameOfCustomer;
        this.orderLineItems = orderLineItems;
        this.totalPizzas = totalPizzas;
        this.deliveryTime = deliveryTime;

    }

}
