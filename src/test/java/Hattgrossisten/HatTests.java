package Hattgrossisten;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HatTests {

    @Test
    public void shouldCreateHat() {
        Hat h = new Hat(2, "Red hat", 100, "M", 3, 5);
        assertEquals(2, h.id);
        assertEquals("Red hat", h.name);
        assertEquals(100, h.price);
        assertEquals("M", h.size);
        assertEquals(3, h.grade);
        assertEquals(5, h.quantity);
    }

    @Test
    public void shouldCreateHatAndNotEqualValues() {
        Hat h = new Hat(4, "Red hat", 100, "M", 3, 5);
        assertNotEquals(2, h.id);
        assertNotEquals("Pink Hat", h.name);
        assertNotEquals(200, h.price);
        assertNotEquals("XL", h.size);
        assertNotEquals(2, h.grade);
        assertNotEquals(3, h.quantity);
    }

    @Test
    public void shouldNotReferToTheSameObject() {
        Hat h = new Hat(1, "Red hat", 100, "M", 3, 6);
        assertNotSame(h, "name: blue hat, price: 100, size: xs, grade: 4, category: Summer");
    }

    @Test
    public void shouldNotThrow() {
        Hat h = new Hat(1, "Red hat", 100, "M", 3, 5);
        assertDoesNotThrow(() -> h);
    }
}
