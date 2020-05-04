public class BalancingBrackets {
    public boolean isBalanced(char[] input) {
        if (input.length == 0)
            return false;
        if (input[0] == '[' && input[1] == ']') {
            return true;
        } else
            return false;
    }
}
