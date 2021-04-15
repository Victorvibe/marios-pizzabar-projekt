package Orders;

public class OrderLineItem {

    //Attributes
    private int subTotal;
    private int quantity;
    private String comment;

    //Constructor
    public OrderLineItem(int subTotal, int quantity, String comment) {
        this.subTotal = subTotal;
        this.quantity = quantity;
        this.comment = comment;

    }
}
