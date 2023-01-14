package Hattgrossisten;

import java.util.ArrayList;
import java.util.List;

public class CustomerBasket {

    public int price;
    List<String> products = new ArrayList<String>();
    List<String> payMethods = new ArrayList<String>();
    List<String> shippingMethods = new ArrayList<String>();

    public static void main(String[] args) {
    }

    public String makeOrder(List<String> products, List<String> payMethods, List<String> shippingMethods, Integer x, Integer price)
            throws IndexOutOfBoundsException {
        this.products = products;
        this.payMethods = payMethods;
        this.shippingMethods = shippingMethods;
        this.price = price;
        List<String> order = new ArrayList<>();
        try {
            order.add(products.get(x));
            order.add(payMethods.get(x));
            order.add(shippingMethods.get(x));
            return "Products: " + order.get(0) + " | Order Total: " + price + " | Payment method: " + order.get(1) + " | Shipping method: " + order.get(2);
        } catch (IndexOutOfBoundsException exception) {
        } return "The order does not exist.";    
    }

    public String pay(List<String>payMethods, Integer price, Integer shipping, Integer x) throws IndexOutOfBoundsException {
        Integer orderTotal = price+shipping;
        try {
        if (orderTotal <= 0 || orderTotal >= Integer.MAX_VALUE) {
            return "Something went wrong with order total, contact customer service";
        } else   
        return "Price: " + price + " kr" + " | Shipping costs " + shipping + " kr" + " | Order total: " + orderTotal + " kr" + " | Payment Method: " + payMethods.get(x);
        } catch (IndexOutOfBoundsException exception) {
        } return "Shipping method does not exist";
    }

}