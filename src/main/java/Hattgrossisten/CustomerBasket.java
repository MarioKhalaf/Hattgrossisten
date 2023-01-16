package Hattgrossisten;

import java.util.ArrayList;
import java.util.List;

public class CustomerBasket {

    public int price;
    List<String> products = new ArrayList<String>();
    List<String> payMethods = new ArrayList<String>();
    List<String> shippingMethods = new ArrayList<String>();

    CustomerBasket(List<String> products, List<String> payMethods, List<String> shippingMethods, Integer price) {
        this.products = products;
        this.payMethods = payMethods;
        this.shippingMethods = shippingMethods;
        this.price = price;
    }

    public static void main(String[] args) {
    }

    public String makeOrder(List<String> products, List<String> payMethods, List<String> shippingMethods, Integer prod, Integer pay_m, Integer ship_m, Integer price)
            throws IndexOutOfBoundsException {
        List<String> order = new ArrayList<>();
        try {
            if (products.isEmpty() && payMethods.isEmpty() && shippingMethods.isEmpty()) {
                return "You have not chosen neither a product, shipping method or payment method, please try again.";
            }
            else if (products.isEmpty()) {
                return "You have no products in your customerbasket.";
            }
            else if (payMethods.isEmpty()) {
                return "You have not chosen a payment option.";
            }
            else if (shippingMethods.isEmpty()) {
                return "You have not chosen a shipping method";
            }    
            else 
            order.add(products.get(prod));
            order.add(payMethods.get(pay_m));
            order.add(shippingMethods.get(ship_m));
            return "Products: " + order.get(0) + " | Order Total: " + price + " | Payment method: " + order.get(1) + " | Shipping method: " + order.get(2);
        } 
        catch (IndexOutOfBoundsException exception) {
        } 
        return "The order does not exist.";    
    }

    public String pay(List<String>payMethods, Integer price, Integer shipping, Integer x) throws IndexOutOfBoundsException {
        Integer orderTotal = price+shipping;
        try {
            if (orderTotal <= 0 || orderTotal >= Integer.MAX_VALUE) {
            return "Something went wrong with order total, contact customer service";
            } 
            else   
            return "Price: " + price + " kr" + " | Shipping costs " + shipping + " kr" + " | Order total: " + orderTotal + " kr" + " | Payment Method: " + payMethods.get(x);
        } 
        catch (IndexOutOfBoundsException exception) {
        } 
            return "Shipping method does not exist";
    }

}