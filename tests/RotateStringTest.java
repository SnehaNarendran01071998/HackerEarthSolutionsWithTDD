import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RotateStringTest {
    @Test
    void shouldReturnTheStringIfNumberOfRotatesIsZero() {
        RotateString rotateString = new RotateString();
        String inputString = "abcd";
        int numberOfRotates = 0;
        char[] rotatedString = rotateString.rotate(numberOfRotates, inputString);
        String actual = new String(rotatedString);
        assertEquals("abcd", actual);
    }

    @Test
    void shouldReturnStringRotatedByASinglePosition() {
        RotateString rotateString = new RotateString();
        String inputString = "abcd";
        int numberOfRotates = 1;
        char[] rotatedString = rotateString.rotate(numberOfRotates, inputString);
        char[] expected = {'b', 'c', 'd', 'a'};
        assertArrayEquals(expected, rotatedString);
    }
}