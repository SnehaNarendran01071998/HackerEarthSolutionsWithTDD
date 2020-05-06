/*
A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {},and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is balanced if the following conditions are met:

It contains no unmatched brackets.
The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
Given n strings of brackets, determine whether each sequence of
brackets is balanced. If a string is balanced, return YES. Otherwise, return NO.*/

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStrings = scanner.nextInt();
        for (int i = 0; i < numberOfStrings; i++) {
            String input = scanner.next();
            char[] stringToCharArray = input.toCharArray();
            if (isBalanced(stringToCharArray))
                System.out.println("YES");
            else System.out.println("NO");

        }
    }

    public static boolean isBalanced(char[] input) {
        Stack stack = new Stack();
        if (input.length == 0)
            return false;
        for (char c : input) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            }
            if (c == ']' || c == '}' || c == ')') {
                if (stack.size() == 0)
                    return false;
                else if (!isClosingBracketOf((Character) stack.pop(), c))
                    return false;
            }
        }

        return stack.size() == 0;
    }

    private static boolean isClosingBracketOf(char poppedElement, char currentCharacter) {
        if (poppedElement == '{' && currentCharacter == '}')
            return true;
        if (poppedElement == '(' && currentCharacter == ')')
            return true;
        return poppedElement == '[' && currentCharacter == ']';
    }
}
