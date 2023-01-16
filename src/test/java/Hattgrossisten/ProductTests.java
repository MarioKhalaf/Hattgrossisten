package Hattgrossisten;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductTests {

    @Test
    public void shouldCreateProduct() {
        Product p = new Product(1, "Product 1", 100, "S", 4, 3);
        assertEquals(1, p.id);
        assertEquals("Product 1", p.name);
        assertEquals(100, p.price);
        assertEquals("S", p.size);
        assertEquals(4, p.grade);
        assertEquals(3, p.quantity);
    }

    @Test
    public void shouldCreateProductAndNotEqualValues() {
        Product p = new Product(1, "Product 1", 0, "S", 4, 3);
        assertNotEquals(2, p.id);
        assertNotEquals("Product 2", p.name);
        assertNotEquals(200, p.price);
        assertNotEquals("XL", p.size);
        assertNotEquals(2, p.grade);
        assertNotEquals(4, p.quantity);
    }

    @Test
    public void shouldNotReferToTheSameObject() {
        Product p = new Product(1, "Product 1", 0, "S", 4, 3);
        assertNotSame(p, "name: Product 2, price: 100, size: xs, grade: 4, quantity: 4");
    }

    @Test
    public void shouldNotThrow() {
        Product p = new Product(1, "Product 1", 0, "S", 4, 3);
        assertDoesNotThrow(() -> p);
    }

    @Test
    public void shouldChangeGrade() {
        Product p = new Product(1, "Product 1", 0, "S", 4, 3);
        int grade = 2;
        assertEquals(3, p.setGrade(grade));
    }

    @Test
    public void shouldReturnZeroIfInputLowerThanZero() {
        Product p = new Product(1, "Product 1", 0, "S", 4, 3);
        int grade = -1;
        assertEquals(0, p.setGrade(grade));
    }

    @Test
    public void shouldReturnZeroIfInputHigherThanFive() {
        Product p = new Product(1, "Product 1", 0, "S", 4, 3);
        int grade = 6;
        assertEquals(0, p.setGrade(grade));
    }

    @Test
    public void shouldReturnSame() {
        Product p = new Product(1, "Product 1", 0, "S", 4, 3);
        int grade = 4;
        assertSame(4, p.setGrade(grade));
    }

    @Test
    public void shouldReturnNotSame() {
        Product p = new Product(1, "Product 1", 0, "S", 4, 3);
        int grade = 2;
        assertNotSame(2, p.setGrade(grade));
    }
}
