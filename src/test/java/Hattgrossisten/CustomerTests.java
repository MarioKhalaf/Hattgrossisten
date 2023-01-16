package Hattgrossisten;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class CustomerTest {
    @Test
    public void registerCustomerTest() {
        // Test that a customer's information is correctly added to the customer list
        // when they register and the ID is incremented correctly.
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer("Raffi Avakian", "raffiavakian@example.com", "018-402-707", "13 Gottsunda", 0);
        customer.registerCustomer(customerList);

        assertEquals(1, customerList.size());
        assertEquals(customer.name, customerList.get(0).name);
        assertEquals(customer.email, customerList.get(0).email);
        assertEquals(customer.phoneNumber, customerList.get(0).phoneNumber);
        assertEquals(customer.address, customerList.get(0).address);
        assertEquals(customer.id, customerList.get(0).id);
    }

    @Test
    public void toStringTest() {
        // Test that the toString method returns the correct string format for a customer
        Customer customer = new Customer("Raffi Avakian", "raffiavakian@example.com", "018-402-707", "13 Gottsunda", 0);
        String expected = "Name: Raffi AvakianEmail: raffiavakian@example.comTele: 018-402-707Address: 13 GottsundaID: 0";
        assertEquals(expected, customer.toString());
    }

    @Test
    public void registerMultipleCustomersTest() {
        // Test that the registerCustomer method can register multiple customers correctly
        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer("Raffi Avakian", "raffiavakian@example.com", "018-402-707", "13 Gottsunda", 0);
        Customer customer2 = new Customer("Sven Svensson", "svensvensson@example.com", "018-400-400", "7 Sunnersta", 0);
        customer1.registerCustomer(customerList);
        customer2.registerCustomer(customerList);

        assertEquals(2, customerList.size());
        assertEquals(customer1.name, customerList.get(0).name);
        assertEquals(customer2.name, customerList.get(1).name);
        assertEquals(1, customerList.get(1).id);
    }

}