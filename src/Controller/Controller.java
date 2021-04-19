package Controller;

import Menu.Menu;
import Orders.Order;
import Orders.OrderList;
import Pizzas.Pizza;

import java.time.LocalTime;
import java.util.ArrayList;

public class Controller {
   //Case 2 i Menu
    OrderList orderList = new OrderList();
    public void checkOrderList () {
        orderList.printListOfOrders();
    }

    //Case 1 i Menu
    public Order createNewOrder (String nameOfCustomer) {
        Order newOrder = new Order(nameOfCustomer);
        return newOrder;
    }

    public void addPizzaToOrder(Order order, int id, int quantity){
        order.addPizzaToOrder(id, quantity);
    }

    public void addCommentToOrder(Order order, String comment) {
        order.setComment(comment);
    }

    public LocalTime getPickupTime(Order order) {
        orderList.calculateWaitTime();
        LocalTime time = orderList.calculateTimeToPickup();
        order.setPickupTime(time);
        orderList.addToListOfOrders(order);
        return order.getPickupTime();
    }

}
