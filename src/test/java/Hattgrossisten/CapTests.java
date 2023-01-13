package Hattgrossisten;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class CapTests {

    @Test
    public void createCap() {
        Cap c = new Cap("Blue cap", 100, "S", 4, "summer");
        assertEquals("Blue cap", c.name);
        assertEquals(100, c.price);
        assertEquals("S", c.size);
        assertEquals(4, c.grade);
        assertEquals("summer", c.category);
    }
}
