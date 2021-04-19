package Statistics;

import Orders.Order;
import Orders.OrderList;
import Pizzas.Pizza;

import java.util.ArrayList;

public class Statistics {
    public static void main(String[] args) {
        System.out.println("Pizza" + );
    }

    OrderList ol = new OrderList();

    public ArrayList<Order> allOrders = ol.getListOfOrders();

    public void amountSoldOfEachPizza() {

        //for (typepåliste variabelnavn : listenavn)
        ArrayList<Pizza> a = new ArrayList<>();
        //For hver ordre tilføjer den alle dens ordres pizzaer.
        for (Order o : allOrders) {
            a.addAll(o.getPizzasInThisOrder());
        }

        int skinkePizza = 0;
        int pepperoniPizza = 0;
        //counter, find ud af de pizza objekter på listen, lav en counter og tæl op.
        for (Pizza p : a) {
            if (p.getID() == 1) {
            pepperoniPizza++;
            }
            else if (p.getID() == 2)
                skinkePizza++;


        }
        System.out.println("Pepperoni Pizzaer: " + pepperoniPizza + "\nSkinke pizzaer: " + );

    }

}
