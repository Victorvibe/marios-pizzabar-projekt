package Orders;
import Pizzas.*;
import java.util.ArrayList;

public class Order {

    Pizza pizza = new Pizza();
    PizzaList pizzaList = new PizzaList();

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

    public Pizza pizzaLineItem (int id) {
        String name = pizzaList.getPizzaList().indexOf(id).
        int price = pizzaList.pizzaList.getPrice();
        return new Pizza(id, name, price);

    }



}
