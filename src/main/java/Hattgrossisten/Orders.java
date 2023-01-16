package Hattgrossisten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Orders {

    public Customer customerInfo;
    public int orderId;
    public List<Product> orderProducts = new ArrayList<>();

    Orders(Customer customerInfo, List<Product> orderProducts) {
        this.customerInfo = customerInfo;
        this.orderProducts = orderProducts;             //This should be passed from CustomerBasket
        setOrderID();
    }

    private void setOrderID() {
        this.orderId = OrderHistory.genOrderId();
    }

    public void acceptOrder(HashMap<String, Integer> storeInventory) {
        for (Product p : this.orderProducts){
            int tempQuant = storeInventory.get(p.getName());
            if(tempQuant > 0){
                storeInventory.put(p.getName(), storeInventory.get(p.getName()) - 1);
            }
            else {
                System.out.printf("%S is out of stock.", p.getName());
            }
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
