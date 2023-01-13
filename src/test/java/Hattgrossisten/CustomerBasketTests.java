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

        String expOutput = ("Products: Test | Order Total: 1000 | Payment method: Test | Shipping method: Test"); // For testing use only
        products.add("Test");
        payMethod.add("Test");
        shippingMethod.add("Test"); // List content for testing use only
        String newlist = cb.makeOrder(products, payMethod, shippingMethod, 0, 1000);
        assertEquals(expOutput, newlist);

    }

    @Test
    public void shouldReturnTheOrderDoesNotExist() {

        // In this testcase, it intentionally gets a position in the lists
        // that does not exists and should return the expexted output.

        String expOutput = ("The order does not exist."); // For testing use only
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
}
