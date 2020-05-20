import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MonkAndPowerOfTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfProcesses = scanner.nextInt();
        int[] idealOrder = new int[numberOfProcesses];
        int[] callingOrder = new int[numberOfProcesses];
        for (int i = 0; i < numberOfProcesses; i++) {
            callingOrder[i] = scanner.nextInt();
        }
        for (int i = 0; i < numberOfProcesses; i++) {
            idealOrder[i] = scanner.nextInt();
        }
        System.out.println(timeTaken(idealOrder, callingOrder));
    }

    public static int timeTaken(int[] idealOrder, int[] callingOrder) {
        int time = 0;
        Queue<Integer> callingOrderQueue = new LinkedList<>();
        Queue<Integer> idealOrderQueue = new LinkedList<>();
        for (int value : callingOrder) {
            callingOrderQueue.add(value);
        }
        for (int value : idealOrder) {
            idealOrderQueue.add(value);
        }
        while (!idealOrderQueue.isEmpty()) {
            assert callingOrderQueue.peek() != null;
            if (callingOrderQueue.peek().equals(idealOrderQueue.peek())) {
                idealOrderQueue.remove();
                callingOrderQueue.remove();
            } else {
                int item = callingOrderQueue.peek();
                callingOrderQueue.remove();
                callingOrderQueue.add(item);
            }
            time++;
        }
        return time;
    }
}
