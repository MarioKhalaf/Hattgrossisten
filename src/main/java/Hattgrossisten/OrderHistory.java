package Hattgrossisten;

import java.util.List;
import java.util.ArrayList;

public class OrderHistory {
    public static List<Orders> storeOrderHistory = new ArrayList<>();
    public static int nextOrderId = 10000;
    
    public static int genOrderId(){
        nextOrderId += 1;
        return nextOrderId;
    }

    public static List<Orders> getStoreOrderHistory() {
        return storeOrderHistory;
    }
}
