/*
 * There are 7 floors in BH3 and only 2 lifts. Initially Lift A is at the ground floor and Lift B at the top floor.
 * Whenever someone calls the lift from N th floor, the lift closest to that floor comes to pick him up.
 *  If both the lifts are at equidistant from the N th floor, them the lift from the lower floor comes up.

 */

import java.util.Scanner;

public class LiftQueries {
    private int positionOfLiftA;
    private int positionOfLiftB;

    public LiftQueries() {
        this.positionOfLiftA = 0;
        this.positionOfLiftB = 7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        LiftQueries liftQueries = new LiftQueries();
        while (testcase > 0) {
            int floorNumber = scanner.nextInt();
            char liftMoved = liftQueries.whichLift(floorNumber);
            System.out.println(liftMoved);
            liftQueries.moveLift(floorNumber, liftMoved);
            testcase--;
        }
    }

    public char whichLift(int floorNumber) {
        if (Math.abs(positionOfLiftA - floorNumber) <= Math.abs(positionOfLiftB - floorNumber)) {
            return 'A';
        } else {
            return 'B';
        }
    }

    public void moveLift(int floorNumber, char lift) {
        if (lift == 'A')
            positionOfLiftA = floorNumber;
        else
            positionOfLiftB = floorNumber;
    }
}
