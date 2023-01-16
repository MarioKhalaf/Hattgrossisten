package Hattgrossisten;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class CapTests {

    @Test
    public void createCap() {
        Cap c = new Cap(1, "Blue cap", 100, "S", 4, 5);
        assertEquals(1, c.id);
        assertEquals("Blue cap", c.name);
        assertEquals(100, c.price);
        assertEquals("S", c.size);
        assertEquals(4, c.grade);
        assertEquals(5, c.quantity);
    }

    @Test
    public void addHats() {
        
    }
}   

