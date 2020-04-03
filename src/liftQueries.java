public class liftQueries {
    private int positionOfLiftA;
    private int positionOfLiftB;

    public liftQueries() {
        this.positionOfLiftA = 0;
        this.positionOfLiftB = 7;
    }

    public char whichLift(int floorNumber) {
        if (Math.abs(positionOfLiftA - floorNumber) <= Math.abs(positionOfLiftB - floorNumber)) {
            return 'A';
        } else {
            return 'B';
        }
    }

    public void moveLiftA(int floorNumber) {
        positionOfLiftA = floorNumber;
    }

    public void moveLiftB(int floorNumber) {
        positionOfLiftB = floorNumber;
    }
}
