package Hattgrossisten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Orders {

    public Customer customerInfo;
    public int orderId;
    public List<Product> orderProducts = new ArrayList<>();

    Orders(Customer customerInfo, int orderId, List<Product> orderProducts) {
        this.customerInfo = customerInfo;
        this.orderId = orderId;                 //Call OrderHistory.genOrderId() in argument
        this.orderProducts = orderProducts;
        setOrderID();
    }

    private void setOrderID() {
        this.orderId = OrderHistory.genOrderId();
    }

    public void acceptOrder(List<Product> basketProductList, HashMap<String, Integer> storeInventory) {
        for (Product p : basketProductList){
            storeInventory.put(p.getName(), storeInventory.get(p.getName()) - 1);
        }
    //Not done yet
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
}
