import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MonkAndPowerOfTimeTest {
    @Test
    void shouldReturnNumberOfProcessesIfTheCallingOrderAndTheIdealOrderAreSame() {
        MonkAndPowerOfTime monkAndPowerOfTime = new MonkAndPowerOfTime();
        int[] idealOrder = new int[]{1, 2, 3};
        int[] callingOrder = new int[]{1, 2, 3};
        int timeTaken = monkAndPowerOfTime.timeTaken(idealOrder, callingOrder);
        Assertions.assertEquals(3, timeTaken);
    }

    @Test
    void shouldReturnDoubleTheNumberOfTheProcessesIdealOrderIsTheReverseOfTheCallingOrder() {
        MonkAndPowerOfTime monkAndPowerOfTime = new MonkAndPowerOfTime();
        int[] idealOrder = new int[]{3,2,1};
        int[] callingOrder = new int[]{1, 2, 3};
        int timeTaken = monkAndPowerOfTime.timeTaken(idealOrder, callingOrder);
        Assertions.assertEquals(6, timeTaken);
    }

    @Test
    void shouldReturnFiveUnitsOfTimeWhenTheIdealOrderAndCallingOrderNeedFiveUnitsTimeToBeProcessed() {
        MonkAndPowerOfTime monkAndPowerOfTime = new MonkAndPowerOfTime();
        int[] idealOrder = new int[]{1,3,2};
        int[] callingOrder = new int[]{3,2,1};
        int timeTaken = monkAndPowerOfTime.timeTaken(idealOrder, callingOrder);
        Assertions.assertEquals(5, timeTaken);
    }
}