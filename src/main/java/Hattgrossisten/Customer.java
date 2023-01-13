package Hattgrossisten;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    public String name;
    public String email;
    public String phoneNumber;
    public String address;
    public int id;

    public Customer() {
    }

    public Customer(String name, String email, String phoneNumber, String address, int id) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.id = id;
    }

    public void registerCustomer(List<Customer> customerList) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        name = input.nextLine();

        System.out.print("Enter your Email: ");
        email = input.nextLine();

        System.out.print("Enter your Phone number: ");
        phoneNumber = input.nextLine();

        System.out.print("Enter your address: ");
        address = input.nextLine();
        
        if (customerList.size() > 0)
            id = customerList.get(customerList.size() - 1).id + 1;
        else
            id=0;
        Customer newCustomer = new Customer(name, email, phoneNumber, address, id);
        customerList.add(newCustomer);
        System.out.println("Customer has been registered.");
    }

    public void displayCustomers(List<Customer> customerList) {
        System.out.println("\n*** Hattgrossistens customer database ***\n");
        for (Customer c : customerList) {
            System.out.println("ID " + c.id + " : " + c.name + " " + c.phoneNumber + " " + c.address);
            id++;
        }
    }

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        while (true) {
            System.out.println("1. Register a customer.");
            System.out.println("2. Display current customers.");

            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();
            Customer c = new Customer();

            switch (choice) {
                case "1": {
                    c.registerCustomer(customerList);
                    break;
                }
                case "2": {
                    c.displayCustomers(customerList);
                    break;
                }
                default:
                    break;
            }

        }
    }
}