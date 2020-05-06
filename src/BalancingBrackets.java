public class BalancingBrackets {
    Stack stack = new Stack();

    public boolean isBalanced(char[] input) {
        if (input.length == 0)
            return false;
        for (char c : input) {
            if (c == '[') {
                stack.push(c);
            }
            if (c == ']') {
                if (stack.size() == 0)
                    return false;
                else if (stack.pop() != '[')
                    return false;
            }
        }
        return stack.size() == 0;
    }
}
