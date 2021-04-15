package Orders;
import Pizzas.*;

import java.util.ArrayList;

public class Order {

    //Attributes
    private String nameOfCustomer;
    private ArrayList<Pizza> pizzaLineItemList = new ArrayList<>();
    private int totalPizzas;
    private int deliveryTime;
    private int totalPrice;

    //constructor with just name as input
    public Order(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    //Constructor
    public Order(String nameOfCustomer, ArrayList<Pizza> pizzaLineItemList, int totalPizzas, int deliveryTime) {
        this.nameOfCustomer = nameOfCustomer;
        this.pizzaLineItemList = pizzaLineItemList;
        this.totalPizzas = totalPizzas;
        this.deliveryTime = deliveryTime;
    }

    public ArrayList<Pizza> getPizzaLineItemList() {
        return this.pizzaLineItemList;
    }

    public void setNameOfCustomer(String name) {
        nameOfCustomer = name;
    }

    //get id and quantity from user input and use that to create copies of the relevant pizzas and add them to
    //pizzaLineItemList, which is this order's list of pizzas
    public void pizzaLineItem (int id, int quantity) {
        //get name and price from pizzaList and create a copy of that pizza to use in this order
        String name = PizzaList.pizzaList.get(id-1).getName(); //subtract 1 to get the correct index
        int price = PizzaList.pizzaList.get(id-1).getPrice();

        Pizza thisPizza = new Pizza(id, name, price);

        //create number of this pizza equal to quantity
        for (int i=1; i<= quantity; i++) {
            pizzaLineItemList.add(thisPizza);
            totalPizzas++;
            totalPrice = totalPrice + thisPizza.getPrice();
        }
    }

    public void printOrder() {
        System.out.println("-------------");
        System.out.println("Navn: " + nameOfCustomer);
        printPizzaLineItemList();
        System.out.println("Pris: " + totalPrice);
        System.out.println("-------------");
    }

    //prints id and name of all pizzas in pizzaLineItemList (which is a list of the pizzas in this order)
    public void printPizzaLineItemList() {
        for(Pizza pizza : pizzaLineItemList) {
            System.out.println(pizza.getID() + " " + pizza.getName());
        }
    }
}
