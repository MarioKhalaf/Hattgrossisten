package Hattgrossisten;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class CustomerBasketTests {

    List<String> products = new ArrayList<>();
    List<String> payMethod = new ArrayList<>();
    List<String> shippingMethod = new ArrayList<>();
    CustomerBasket cb = new CustomerBasket();

    @Test
    public void shouldReturnOrderInfo() {

        // In this testcase, the test compares
        // the wanted output to the actual output and checks if they are the same.

        String expOutput = ("Products: Test | Order Total: 1000 | Payment method: Test | Shipping method: Test"); 
        products.add("Test");
        payMethod.add("Test");
        shippingMethod.add("Test"); 
        String newlist = cb.makeOrder(products, payMethod, shippingMethod, 0, 1000);
        assertEquals(expOutput, newlist);

    }

    @Test
    public void shouldReturnTheOrderDoesNotExist() {

        // In this testcase, it intentionally gets a position in the lists
        // that does not exists and should return the expexted output.

        String expOutput = ("The order does not exist."); 
        products.add("");
        payMethod.add("");
        shippingMethod.add(""); // List content for testing use only
        String order = cb.makeOrder(products, payMethod, shippingMethod, 1, 1000);
        assertEquals(expOutput, order);

    }

    @Test
    public void shouldAssertNotSame() {

        // In this testcase, the test compares the expected output that is intentionally
        // written wrong
        // and compares to actual output.

        String expOutput = ("Products: NotTheSame | Payment method: NotTheSame | Shipping method: NotTheSame");
        products.add("");
        payMethod.add("");
        shippingMethod.add("");
        String order = cb.makeOrder(products, payMethod, shippingMethod, 0, 1000);
        assertNotSame(expOutput, order);
    }

    @Test
    public void shouldReturnErrorMsg() {

        // In this testcase, the method has intentionally not gotten a shipping method
        // added to the list of the order
        // and should in this case return the expected error message

        String expOutput = ("The order does not exist.");
        products.add("");
        payMethod.add("");
        String order = cb.makeOrder(products, payMethod, shippingMethod, 0, 1000);
        assertEquals(expOutput, order);
    }

    @Test
    public void shouldReturnOrderTotal() {
        
        // This test compares expected output to actual output

        payMethod.add("Test");
        String expOutput = ("Price: 1000 kr | Shipping costs 59 kr | Order total: 1059 kr | Payment Method: Test");
        String orderTotal = cb.pay(payMethod, 1000, 59, 0);
        assertEquals(expOutput, orderTotal);
    }

    @Test
    public void shouldReturnTooSmallOrderTotal() {
        
        // This test tries to enter int minimum value as order total and should give an error message
        
        payMethod.add("Test");
        String expOutput = ("Something went wrong with order total, contact customer service");
        String orderTotal = cb.pay(payMethod, Integer.MIN_VALUE, -1, 0);
        assertEquals(expOutput, orderTotal);

    }
    
    @Test
    public void shouldReturnErrorMsgOrderTota() {
        
        // This test tries to enter integer maximum value as order total and should give an error message

        payMethod.add("Test");
        String expOutput = ("Something went wrong with order total, contact customer service");
        String orderTotal = cb.pay(payMethod, Integer.MAX_VALUE, 1000, 0);
        assertEquals(expOutput, orderTotal);
    }
    
    @Test
    public void shouldAssertNotEqual() {
        
        // This test compares expected output to actual output and should NOT give the same output
        
        payMethod.add("Test");
        String expOutput = ("Price: 1000 kr | Shipping costs 59 kr | Order total: 1059 kr | Payment Method: Budbee");
        String orderTotal = cb.pay(payMethod, 100, 5, 0);
        assertNotEquals(expOutput, orderTotal);

    }

    @Test
    public void shouldReturnMissingShippingMethod() {
        
        // This test tries to enter a shipping method that does not exist and should give an error message
        
        payMethod.add("");
        String expOutput = ("Shipping method does not exist");
        String orderTotal = cb.pay(payMethod, 0, 0, 10);
        assertNotEquals(expOutput, orderTotal);
    }

}
