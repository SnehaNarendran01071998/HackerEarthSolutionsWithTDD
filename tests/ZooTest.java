import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
    @Test
    void shouldReturnTrueIfZooIsInput() {
        Zoo zoo = new Zoo();
        String input = "zoo";
        assertTrue(zoo.similarTo(input));
    }

    @Test
    void shouldReturnFalseIfZoooIsInput() {
        Zoo zoo = new Zoo();
        String input = "zooo";
        assertFalse(zoo.similarTo(input));
    }

    @Test
    void shouldReturnTrueIfInputIsZzoooo() {
        Zoo zoo = new Zoo();
        String input = "zzoooo";
        assertTrue(zoo.similarTo(input));
    }
    @Test
    void shouldReturnCountAsZeroIfNoLetterZInInput() {
        Zoo zoo = new Zoo();
        String input = "oooooo";
        int countOfZ = zoo.zCounter(input);
        assertEquals(0,countOfZ);
    }
}
