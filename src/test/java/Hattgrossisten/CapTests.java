package Hattgrossisten;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CapTests {

    @Test
    public void shouldCreateCap() {
        Cap c = new Cap(1, "Blue cap", 100, "S", 4, 5);
        assertEquals(1, c.id);
        assertEquals("Blue cap", c.name);
        assertEquals(100, c.price);
        assertEquals("S", c.size);
        assertEquals(4, c.grade);
        assertEquals(5, c.quantity);
    }

    @Test
    public void shouldCreateCapAndNotEqualValues() {
        Cap c = new Cap(2, "Blue cap", 100, "S", 4, 5);
        assertNotEquals(1, c.id);
        assertNotEquals("Red cap", c.name);
        assertNotEquals(200, c.price);
        assertNotEquals("XL", c.size);
        assertNotEquals(2, c.grade);
        assertNotEquals(4, c.quantity);
    }

    @Test
    public void shouldNotReferToTheSameObject() {
        Cap c = new Cap(1, "Blue cap", 100, "XS", 4, 5);
        assertNotSame(c, "name: blue cap, price: 100, size: xs, grade: 4, category: summer");
    }

    @Test
    public void shouldNotThrow() {
        Cap c = new Cap(1, "Blue cap", 100, "XS", 4, 5);
        assertDoesNotThrow(() -> c);
    }


}
