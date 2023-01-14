package Hattgrossisten;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CapTests {

    @Test
    public void shouldCreateCap() {
        Cap c = new Cap("Blue cap", 100, "S", 4, "summer");
        assertEquals("Blue cap", c.name);
        assertEquals(100, c.price);
        assertEquals("S", c.size);
        assertEquals(4, c.grade);
        assertEquals("summer", c.category);
    }

    @Test
    public void shouldCreateCapAndNotEqualValues() {
        Cap c = new Cap("Blue cap", 100, "S", 4, "summer");
        assertNotEquals("Red cap", c.name);
        assertNotEquals(200, c.price);
        assertNotEquals("XL", c.size);
        assertNotEquals(2, c.grade);
        assertNotEquals("winter", c.category);
    }

    @Test
    public void shouldNotReferToTheSameObject() {
        Cap c = new Cap("Blue cap", 100, "XS", 4, "summer");
        assertNotSame(c, "name: blue cap, price: 100, size: xs, grade: 4, category: summer");
    }

    @Test
    public void shouldNotThrow() {
        Cap c = new Cap("Blue cap", 100, "XS", 4, "summer");
        assertDoesNotThrow(() -> c);
    }

    @Test
    public void shouldPrintCap() {
        Cap c = new Cap("Blue cap", 100, "XS", 4, "summer");
        assertEquals("name: Blue cap, price: 100, size: XS, grade: 4, category: summer", c.toString());
    }

    @Test
    public void shouldPrintCapThatNotEqualValues() {
        Cap c = new Cap("Blue cap", 100, "XS", 4, "summer");
        assertNotEquals("name: Red cap, price: 10, size: S, grade: 3, category: fall", c.toString());
    }

    @Test
    public void shouldNotThrowWhenUsingMethod() {
        Cap c = new Cap("Blue cap", 100, "XS", 4, "summer");
        assertDoesNotThrow(() -> c.toString());
    }

}