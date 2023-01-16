package Hattgrossisten;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
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
        assertNotSame("name: blue hat, price: 100, size: xs, grade: 4, category: Summer", h);
    }

    @Test
    public void shouldNotThrow() {
        Hat h = new Hat(1, "Red hat", 100, "M", 3, 5);
        assertDoesNotThrow(() -> h);
    }

    @Test
    public void shouldShowTheCorrectSizeOfList() {
        Hat hat = new Hat();
        List<Hat> hatList = hat.addHats();
        assertTrue(hatList.size() == 5);
    }

    @Test
    public void shouldShowTheIncorrectSizeOfList() {
        Hat hat = new Hat();
        List<Hat> hatList = hat.addHats();
        assertFalse(hatList.size() == 10);
    }

    @Test
    public void shouldGetValueFromFirstIndexInList() {
        Hat hat = new Hat();
        assertEquals(1, hat.addHats().get(0).id);
        assertEquals("Black Hat ", hat.addHats().get(0).name);
        assertEquals(50, hat.addHats().get(0).price);
        assertEquals("M", hat.addHats().get(0).size);
        assertEquals(3, hat.addHats().get(0).grade);
        assertEquals(1, hat.addHats().get(0).quantity);
    }
}
