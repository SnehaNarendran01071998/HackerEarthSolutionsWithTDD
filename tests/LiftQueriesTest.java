import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LiftQueriesTest {

    @Test
    void shouldReturnLiftAIfCalledFromZerothFloor() {
        LiftQueries liftQueries = new LiftQueries();
        int floorNumber = 0;
        assertEquals('A', liftQueries.whichLift(floorNumber));
    }

    @Test
    void shouldReturnLiftBIfCalledFromSeventhFloor() {
        LiftQueries liftQueries = new LiftQueries();
        int floorNumber = 7;
        assertEquals('B', liftQueries.whichLift(floorNumber));
    }

    @Test
    void shouldReturnLiftAIfCalledFromFirstFloor() {
        LiftQueries liftQueries = new LiftQueries();
        int floorNumber = 3;
        assertEquals('A', liftQueries.whichLift(floorNumber));
    }

    @Test
    void shouldReturnLiftAIfCalledFromFifthFloorIfListAIsAtThirdFloor() {
        LiftQueries liftQueries = new LiftQueries();
        int floorNumber = 5;
        int newPositionOfLift = 3;
        liftQueries.moveLift(newPositionOfLift, 'A');
        assertEquals('A', liftQueries.whichLift(floorNumber));
    }

    @Test
    void shouldReturnLiftBIfCalledFromThirdFloorIfListBIsAtFourthFloor() {
        LiftQueries liftQueries = new LiftQueries();
        int floorNumber = 3;
        int newPositionOfLift = 4;
        liftQueries.moveLift(newPositionOfLift, 'B');
        assertEquals('B', liftQueries.whichLift(floorNumber));
    }

}