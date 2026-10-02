package QueSkip;
import java.util.ArrayList;

public class Order {

    private int orderId;
    private Customer customer;
    private Business business;
    private ArrayList<MenuItem> orderedItems;

    //Constructors
    public Order(int orderId, Customer customer, Business business) {
        this.orderId = orderId;
        this.customer = customer;
        this.business = business;
        this.orderedItems = new ArrayList<>();

    }

    //Getters
    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Business getBusiness() {
        return business;
    }

    public ArrayList<MenuItem> getOrderedItems() {
        return new ArrayList<>(orderedItems);
    }


    //Methods
    public void addOrderedItem(MenuItem item) {
        orderedItems.add(item);
    }

    public void removeOrderedItem(MenuItem item) {
        orderedItems.remove(item);
    }
}
