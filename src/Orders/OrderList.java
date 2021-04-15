package Orders;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class OrderList {

    private int currentWaitTime = 0; //
    private int cookTime = 10; //minutes to cook one pizza
    //private ArrayList<Order> orderArrayList = new ArrayList<Order>();

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
    }

    /*
    public int calculateWaitTime() {
        for (Order order : orderArrayList) {
            for (Pizza : order) {
                waitTime.add(pizzaCookTime);
            }
        }
        return 0; //change this
    }

     */

}
