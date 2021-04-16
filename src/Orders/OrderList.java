package Orders;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class OrderList {

    private int waitTime = 0; //
    private final int COOK_TIME = 10; //minutes to cook one pizza
    private static ArrayList<Order> listOfOrders = new ArrayList<>(); //static because we only want one to exist

    public int getWaitTime() {
        return waitTime;
    }

    public ArrayList<Order> getListOfOrders() {
        return listOfOrders;
    }

    public void addToListOfOrders(Order thisOrder) {
        listOfOrders.add(thisOrder);
    }

    //call to calculate waiting time (in minutes) based on how many pizzas are currently waiting to be made
    public void calculateWaitTime() {
        //go through list of orders...
        for (Order order : listOfOrders) {
            //and then, in each order, check how large the getPizzaLineItemList() (which indicates the number of pizzas
            //in that order) and then add COOK_TIME to waitTime for each pizza
            for (int i=0; i < order.getPizzaLineItemList().size(); i++) {
                waitTime = waitTime + COOK_TIME;
            }
        }
    }

    //call this to calculate when a pickup will be ready for pickup, based on the current waiting time
    public LocalTime calculateTimeToPickup() {
        LocalTime time = LocalTime.now();
        time = time.plusMinutes(waitTime).truncatedTo(ChronoUnit.MINUTES);
        //System.out.println(time.truncatedTo(ChronoUnit.MINUTES));
        return time;
    }

}
