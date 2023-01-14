package Hattgrossisten;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HatTests {

    @Test
    public void shouldCreateHat() {
        Hat h = new Hat("Red hat", 100, "M", 3, "fall");
        assertEquals("Red hat", h.name);
        assertEquals(100, h.price);
        assertEquals("M", h.size);
        assertEquals(3, h.grade);
        assertEquals("fall", h.category);
    }

    @Test
    public void shouldCreateHatAndNotEqualValues() {
        Hat h = new Hat("Red hat", 100, "M", 3, "fall");
        assertNotEquals("Pink Hat", h.name);
        assertNotEquals(200, h.price);
        assertNotEquals("XL", h.size);
        assertNotEquals(2, h.grade);
        assertNotEquals("winter", h.category);
    }

    @Test
    public void shouldNotReferToTheSameObject() {
        Hat h = new Hat("Red hat", 100, "M", 3, "fall");
        assertNotSame(h, "name: blue hat, price: 100, size: xs, grade: 4, category: Summer");
    }

    @Test
    public void shouldNotThrow() {
        Hat h = new Hat("Red hat", 100, "M", 3, "fall");
        assertDoesNotThrow(() -> h);
    }

    @Test
    public void shouldPrintHat() {
        Hat h = new Hat("Red hat", 100, "M", 3, "fall");
        assertEquals("name: Red hat, price: 100, size: M, grade: 3, category: fall", h.toString());
    }

    @Test
    public void shouldPrintHatThatNotEqualValues() {
        Hat h = new Hat("Red hat", 100, "M", 3, "fall");
        assertNotEquals("name: Blue hat, price: 10, size: S, grade: 3, category: summer", h.toString());
    }

    @Test
    public void shouldNotThrowWhenUsingMethod() {
        Hat h = new Hat("Red hat", 100, "M", 3, "fall");
        assertDoesNotThrow(() -> h.toString());
    }
}
