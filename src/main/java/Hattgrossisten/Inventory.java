package Hattgrossisten;

import java.util.HashMap;

public class Inventory {

    public static HashMap<String, Integer> inventoryMap = new HashMap<>();

    public static HashMap<String, Integer> getInventory() {         // Return entire warehouse inventory
        return inventoryMap;
    }

    public static int getProductQuant(String productName) {         //Returns quantity in inventory of a specific product
        return inventoryMap.get(productName);
    }

    public static void addNewProduct(String productName, int productQuantity) {     //Add a new product to the inventory
        inventoryMap.put(productName, productQuantity);
    }

    public void quantity() {
        System.out.println("Shows the inventory of all the products");
    }
}
