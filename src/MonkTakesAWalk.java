import java.util.Scanner;

public class MonkTakesAWalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            String input = scanner.next();
            System.out.println(numberOfVowels(input));
        }
    }

    public static int numberOfVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.toString(input.charAt(i)).matches("[aeiouAIEOU]"))
                count++;
        }
        return count;
    }
}
