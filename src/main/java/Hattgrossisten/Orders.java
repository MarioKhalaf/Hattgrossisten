package Hattgrossisten;

import java.util.ArrayList;
import java.util.List;

public class Orders {

    public Customer customerInfo;
    public int orderId;
    public List<Product> orderProducts = new ArrayList<>();

    Orders(Customer customerInfo, int orderId, List<Product> orderProducts) {
        this.customerInfo = customerInfo;
        this.orderId = orderId;                 //Call OrderHistory.genOrderId() in argument
        this.orderProducts = orderProducts;
    }

    public void setOrderID() {
        this.orderId = OrderHistory.genOrderId();
    }

    public void acceptOrder(){
        //the order has been created, thus payment went through. get call remProduct in Inventory.
    }

    public Customer getCustomerinfo() {
        return customerInfo;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getOrderproducts() {
        return orderProducts;
    }
    // public void sendOrder() {
    //     System.out.println("Sends order to customer");
    // }

    // public void decreseInventory() {
    //     // Method that decreses the inventory
    }
}
