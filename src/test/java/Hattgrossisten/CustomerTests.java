package Hattgrossisten;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerTest {
    private Customer[] customers = {
        new Customer("Raffi", "Avakian", "Sweden", LocalDate.of(1988, 6, 11), new Order[] {new Order(LocalDate.of(2022,1,1),100)}, "raffi.avakian@example.com"),
        new Customer("Sven", "Svensson", "Sweden", LocalDate.of(2003, 2, 28),new Order[] {}, "sven.svensson@example.com"),
        new Customer("Babbe", "Babbesson", "Denmark", LocalDate.of(1990, 5, 15), new Order[] {new Order(LocalDate.of(2022,1,1),200)}, "babbe.babbesson@example.com")
    };

    @Test
    public void testValidCountryOfOrigin() {
        //This test checks if the number of customers with a valid country of origin is 2
        int validCustomers = 0;
        for (Customer customer : customers) {
            if (customer.getCountryOfOrigin().equals("Sweden")) {
                validCustomers++;
            }
        }
        assertEquals(2, validCustomers);
    }

    @Test
    public void testAgeRestriction() {
        //This test checks if the number of customers who are at least 18 years old is 2
        int validCustomers = 0;
        for (Customer customer : customers) {
            Period age = Period.between(customer.getDOB(), LocalDate.now());
            if (age.getYears() >= 18) {
                validCustomers++;
            }
        }
        assertEquals(2, validCustomers);
    }

    @Test
    public void testOrderHistory() {
        //This test checks if the number of customers who have ordered at least one time is 2
        int validCustomers = 0;
        for (Customer customer : customers) {
            if (customer.getOrders().length > 0) {
                validCustomers++;
            }
        }
        assertEquals(2, validCustomers);
    }

    @Test
    public void testValidEmailAddress() {
        //This test checks if the email address of all customers is valid
        int validCustomers = 0;
        for (Customer customer : customers) {
            String email = customer.getEmail();
            String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                validCustomers++;
            }
        }
        assertEquals(3, validCustomers);
    }
}