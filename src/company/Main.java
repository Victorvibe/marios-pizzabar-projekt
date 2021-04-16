package company;
import Orders.*;
import Pizzas.PizzaList;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        PizzaList.createPizzaList(); //initialize the pizzaList (the menu containing all available pizzas)

        //test case
	    Order testOrder = new Order("TestKunde");
	    testOrder.addPizzaToOrder(5,2);
        System.out.println(testOrder.getPizzaLineItemList());
        testOrder.printOrder();
        OrderList testOrderList = new OrderList();
        testOrderList.addToListOfOrders(testOrder);
        testOrderList.calculateWaitTime();
        System.out.println("Ventetid: " + testOrderList.getWaitTime() + " min");
        System.out.println("Afhentning: " + testOrderList.calculateTimeToPickup());
        testOrderList.printListOfOrders();
    }
}
