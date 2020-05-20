import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonkTakesAWalkTest {

    @Test
    void shouldReturnZeroIfThereAreNoVowelsInTheString() {
        MonkTakesAWalk monkTakesAWalk = new MonkTakesAWalk();
        String input = "k";
        int numberOfVowels = monkTakesAWalk.numberOfVowels(input);
        assertEquals(0, numberOfVowels);
    }

    @Test
    void shouldReturnOneWhenASingleVowelIsTheString() {
        MonkTakesAWalk monkTakesAWalk = new MonkTakesAWalk();
        String input = "a";
        int numberOfVowels = monkTakesAWalk.numberOfVowels(input);
        assertEquals(1, numberOfVowels);
    }

    @Test
    void shouldReturnTheNumberOFVowelsInAStringMixedWithConsonantsAndVowels() {
        MonkTakesAWalk monkTakesAWalk = new MonkTakesAWalk();
        String input = "axsbjsbiobvnm";
        int numberOfVowels = monkTakesAWalk.numberOfVowels(input);
        assertEquals(3, numberOfVowels);
    }
}