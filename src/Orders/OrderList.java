package Orders;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class OrderList {

    private int waitTime = 0; //
    private int cookTime = 10; //minutes to cook one pizza
    private ArrayList<Order> listOfOrders = new ArrayList<>();
    //private ArrayList<Order> orderArrayList = new ArrayList<Order>();

    //test
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
    }

    /*
    public int calculateWaitTime() {
        for (Order order : listOfOrders) {
            for (Pizza pizza : order) {
                waitTime = waitTime + cookTime;
            }
        }
        return 0; //change this
    }
     */

}
