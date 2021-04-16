package Controller;

import Menu.Menu;
import Orders.OrderList;
import Pizzas.Pizza;

import java.util.ArrayList;

public class Controller {
   //Case 2 i Menu
    OrderList orderList = new OrderList();
    public void checkOrderList () {
        orderList.printListOfOrders();
    }


    //Case 1 i Menu
    public void createOrder (String nameOfCustomer, ArrayList<Pizza> pizzaLineItemList, int totalPizzas, int pickupTime, int totalPrice) {

    }
}
