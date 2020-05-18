import java.util.Scanner;

public class WetClothes {
    public static final int maximum = 999999;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfIntervals = scanner.nextInt();

        int numberOfClothes = scanner.nextInt();
        int numberOfAttempts = scanner.nextInt();
        int[] intervalsOfRain = new int[numberOfIntervals];
        int[] durationOfDrying = new int[numberOfClothes];
        for (int i = 0; i < numberOfIntervals; i++) {
            intervalsOfRain[i] = scanner.nextInt();
        }
        for (int i = 0; i < numberOfClothes; i++) {
            durationOfDrying[i] = scanner.nextInt();
        }
        System.out.println(numberOfClothesTaken(intervalsOfRain, durationOfDrying, numberOfAttempts));
    }

    public static int numberOfClothesTaken(int[] intervalsOfRain, int[] durationOfDrying, int numberOfAttempts) {
        int numberOfClothes = 0;
        int[] differenceBetweenIntervals = new int[intervalsOfRain.length - 1];

        for (int i = 1, j = 0; i < intervalsOfRain.length; i = i + 1, j++) {
            differenceBetweenIntervals[j] = intervalsOfRain[i] - intervalsOfRain[i - 1];
        }

        for (int betweenInterval : differenceBetweenIntervals) {
            for (int k = 0; k < durationOfDrying.length; k++) {

                if (betweenInterval >= durationOfDrying[k]) {
                    numberOfClothes++;
                    durationOfDrying[k] = maximum;
                    System.out.println("Duration  "+durationOfDrying[k]+"   "+"Interval "+betweenInterval+"    "+betweenInterval);
                }
            }
        }
        return Math.min(numberOfClothes, numberOfAttempts);
    }
}
