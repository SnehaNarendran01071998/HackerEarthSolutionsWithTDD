public class BalancingBrackets {
    Stack stack = new Stack();

    public boolean isBalanced(char[] input) {
        if (input.length == 0)
            return false;
        for (char c : input) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            }
               if (c == ']' || c == '}' || c == ')') {
                    if (stack.size() == 0)
                        return false;
                    else if (!isClosingBracketOf(stack.pop(), c))
                        return false;
                }
            }

        return stack.size() == 0;
    }

    private boolean isClosingBracketOf(char poppedElement, char currentCharacter) {
        if (poppedElement == '{' && currentCharacter == '}')
            return true;
        if (poppedElement == '(' && currentCharacter == ')')
            return true;
        return poppedElement == '[' && currentCharacter == ']';
    }
}
