package Controller;

import Menu.Menu;
import Orders.OrderList;

public class Controller {
   //Case 2 i Menu
    OrderList orderList = new OrderList();
    public void checkOrderList () {
        orderList.printListOfOrders();
    }
}
