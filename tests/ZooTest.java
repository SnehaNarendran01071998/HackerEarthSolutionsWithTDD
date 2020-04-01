import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
