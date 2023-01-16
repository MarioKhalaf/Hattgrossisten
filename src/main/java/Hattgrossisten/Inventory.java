package Hattgrossisten;

import java.util.HashMap;

public class Inventory {

    public HashMap<String, Integer> inventoryMap = new HashMap<>();

    public HashMap<String, Integer> getInventory() { // Return entire warehouse inventory
        return inventoryMap;
    }

    public int getProductQuant(String productName) { // Returns quantity in inventory of a specific product
        return inventoryMap.get(productName);
    }

    public void addNewProduct(String productName, int productQuantity) { // Add a new product to the inventory
        inventoryMap.put(productName, productQuantity);
    }

    public boolean updateProductQuant(String productName, int productQuantity) { // Function for updating the quantity
                                                                                 // of an already existing product
        if (inventoryMap.containsKey(productName) && productQuantity >= 0) {
            inventoryMap.put(productName, productQuantity);
            return true;
        } else {
            return false;
        }
    }
}
