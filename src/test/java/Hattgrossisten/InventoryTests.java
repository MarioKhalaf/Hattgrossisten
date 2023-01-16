package Hattgrossisten;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InventoryTests {

    @Test
    public void shouldUpdateProductQuantityOnValidInput() {
        Hat testHat = new Hat(1, "Awesome Beanie", 100, "M", 4, 5);
        Inventory testInventory = new Inventory();
        testInventory.addNewProduct(testHat.name, 20);
        assertEquals(true, testInventory.updateProductQuant(testHat.getName(), 5));
        assertEquals(5, testInventory.getProductQuant(testHat.getName()));
    }

    @Test
    void shouldNotUpdateProductQuantityOnInvalidQuantity() {
        Hat testHat = new Hat(1, "Awesome Beanie", 100, "M", 4, 5);
        Inventory testInventory = new Inventory();
        testInventory.addNewProduct(testHat.name, 20);
        assertEquals(false, testInventory.updateProductQuant(testHat.getName(), -2));
        assertEquals(20, testInventory.getProductQuant(testHat.getName()));
    }

    @Test
    void shouldFailOnUpdatingNonExistantProduct() {
        Hat testHat = new Hat(1, "Awesome Beanie", 100, "M", 4, 5);
        Inventory testInventory = new Inventory();
        testInventory.addNewProduct(testHat.name, 20);
        assertEquals(false, testInventory.updateProductQuant("Awful Beanie", 10));
    }
}
