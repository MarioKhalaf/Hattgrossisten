package Hattgrossisten;

import java.util.ArrayList;
import java.util.List;

public class CustomerBasket {

    public int price;
    List<String> products = new ArrayList<String>();
    List<String> payMethods = new ArrayList<String>();
    List<String> shippingMethods = new ArrayList<String>();

    public void pay() {
        System.out.println("Makes the customer pay");
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
        }
        String errormsg = ("The order does not exist.");
        return errormsg;
        
    }
}
