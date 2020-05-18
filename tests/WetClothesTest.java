import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WetClothesTest {

    @Test
    void shouldReturnZeroWhenTheNumberOfAttemptsAreZero() {
        int numberOfAttempts = 0;
        int[] intervalsOfRain = {1, 2};
        int[] durationOfDrying = new int[]{0, 1};
        int numberOfClothes = WetClothes.numberOfClothesTaken(intervalsOfRain, durationOfDrying, numberOfAttempts);
        Assertions.assertEquals(0, numberOfClothes);
    }

    @Test
    void shouldReturnOneWhenOneClothCanBeTakenInOneSecondInBetweenWithDurationOfDryingAs1Second() {
        int numberOfAttempts = 1;
        int[] durationOfDrying = new int[]{1};
        int[] intervalsOfRain = new int[]{1, 2};
        int numberOfClothes = WetClothes.numberOfClothesTaken(intervalsOfRain, durationOfDrying, numberOfAttempts);
        Assertions.assertEquals(1, numberOfClothes);
    }

    @Test
    void shouldReturnTwoClothesWhenTheDurationPermitsOnyTwoClothesToBeTaken() {
        int numberOfAttempts = 2;
        int[] durationOfDrying = new int[]{4, 1, 3};
        int[] intervalsOfRain = new int[]{3, 5, 8};
        int numberOfClothes = WetClothes.numberOfClothesTaken(intervalsOfRain, durationOfDrying, numberOfAttempts);
        Assertions.assertEquals(2, numberOfClothes);
    }
}