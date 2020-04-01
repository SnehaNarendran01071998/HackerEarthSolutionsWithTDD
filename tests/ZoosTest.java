import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZoosTest {
    @Test
    void shouldReturnTrueIfZooIsInput() {
        Zoos zoos = new Zoos();
        String input = "zoo";
        assertTrue(zoos.similarTo(input));
    }
}