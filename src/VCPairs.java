/*Max has a string S with length N. He needs to find the number of indices i (1≤i≤N−11≤i≤N−1) such that the i-th character of this string is a consonant and the i+1th character is a vowel. However,she is busy, so she asks for your help.

Note: The letters 'a', 'e', 'i', 'o', 'u' are vowels; all other lowercase English letters are consonants.

Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains a single string S with length N.
Output

For each test case, print a single line containing one integer ― the number of occurrences of a vowel immediately after a consonant*/

import java.util.Scanner;

public class VCPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTestCases = scanner.nextInt();
        for (int i = 0; i < numberOfTestCases; i++) {
            int stringLength = scanner.nextInt();
            String input = scanner.next();
            int result = countVcPairs(input, stringLength);
            System.out.println(result);
        }
    }

    public static int countVcPairs(String input, int stringLength) {
        int count = 0;
        for (int i = 1; i < stringLength; i++) {
            if (Character.toString(input.charAt(i)).matches("[aeiou]") &&
                    !Character.toString(input.charAt(i - 1)).matches("[aeiou]")) {
                count++;
            }
        }
        return count;
    }
}
