package Hattgrossisten;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
public class OrdersTests {
    
    @Test
    public void shouldDecreaseInventoryQuant() {
        Hat testHat = new Hat(1 ,"Awesome Beanie" , 100, "M", 4, 5 );
        Inventory testInventory = new Inventory();
        Customer testCustomer = new Customer("Rickard", "rickard@mail.se", "0712345678", "Gatan 2", 1);
        List<Product> testList = new ArrayList<>();
        Orders testOrder = new Orders(testCustomer, testList);
        testList.add(testHat);
        testInventory.addNewProduct(testHat.getName(), 5);
        testOrder.acceptOrder(testInventory.inventoryMap);
        assertEquals(4, testInventory.inventoryMap.get("Awesome Beanie"));        
    }

    @Test
    public void shouldNotDecreaseInventoryQuant() {
        Hat testHat = new Hat(1 ,"Awesome Beanie" , 100, "M", 4, 5 );
        Inventory testInventory = new Inventory();
        Customer testCustomer = new Customer("Rickard", "rickard@mail.se", "0712345678", "Gatan 2", 1);
        List<Product> testList = new ArrayList<>();
        Orders testOrder = new Orders(testCustomer, testList);
        testList.add(testHat);
        testInventory.addNewProduct(testHat.getName(), 0);
        testOrder.acceptOrder(testInventory.inventoryMap);
        assertNotEquals(-1, testInventory.inventoryMap.get("Awesome Beanie"));        
    }

    @Test
    public void shouldSetOrderId() {
        Customer testCustomer = new Customer("Rickard", "rickard@mail.se", "0712345678", "Gatan 2", 1);
        List<Product> testList = new ArrayList<>();
        Orders testOrder = new Orders(testCustomer, testList);
        assertEquals(10001, testOrder.orderId);
    }


}
