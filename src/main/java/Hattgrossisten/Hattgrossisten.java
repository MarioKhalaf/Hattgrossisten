package Hattgrossisten;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Hattgrossisten {
    public static void main(String[] args) {
        Customer customers = new Customer();
        List<Customer> customerList = new ArrayList<>();
        Hat hat = new Hat();
        List<Hat> hatList = hat.addHats();

        while (true) {
            System.out.println("1. Register a customer.");
            System.out.println("2. Display current customers.");
            System.out.println("3. Product display.");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();

            switch (choice) {
                case "1": {
                    customers.registerCustomer(customerList);
                    break;
                }
                case "2": {
                    customers.displayCustomers(customerList);
                    break;
                }
                case "3": {
                    displayProducts(hatList);
                    chooseProduct(hatList);
                    break;
                }
                default:
                    break;
            }

        }
    }

    static void displayProducts(List<Hat> hatList) {
        System.out.println("Choose product you'd like to add to your cart:\n");
        System.out.println("ID | Name       | Price | Size | Grade | Quantity \n");
        for (Hat h : hatList) {
            System.out.println(h.id + "  | " + h.name + " |  " + h.price + "   |  " + h.size + "   |   " + h.grade
                    + "   |   " + h.quantity);
        }
    }

    static void chooseProduct(List<Hat> hatList) {
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        for (Hat h : hatList) {
            int i = 0;
            if (option == h.id) {
                System.out.println(h.name + " Has been added to your cart.");
                hatList.get(i).quantity -= 1;
                i++;
                break;
            }
        }
    }
}
