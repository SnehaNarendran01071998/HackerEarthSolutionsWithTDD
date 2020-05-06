import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalancingBracketsTest {
    @Test
    void shouldReturnFalseForAnEmptyArray() {
        char[] input = {};
        BalancingBrackets balancingBrackets = new BalancingBrackets();
        Assertions.assertFalse(balancingBrackets.isBalanced(input));
    }

    @Test
    void shouldReturnTrueIfAClosingBracketIsFoundForAnOpeningBracket() {
        char[] input = {'[', ']'};
        BalancingBrackets balancingBrackets = new BalancingBrackets();
        Assertions.assertTrue(balancingBrackets.isBalanced(input));
    }

    @Test
    void shouldReturnFalseIfTheBracketsAreNotBalanced() {
        char[] input = {'[', ']', '['};
        BalancingBrackets balancingBrackets = new BalancingBrackets();
        Assertions.assertFalse(balancingBrackets.isBalanced(input));
    }
    @Test
    void shouldReturnFalseIfTheBracketsAreNotBalancedForDifferentTypeOfBrackets() {
        char[] input = {'[', ']', '[','}','{'};
        BalancingBrackets balancingBrackets = new BalancingBrackets();
        Assertions.assertFalse(balancingBrackets.isBalanced(input));
    }
    @Test
    void shouldReturnTrueIfAClosingBracketIsFoundForAnOpeningBracketForDifferentTypeOfBrackets() {
        char[] input = {'{','[', ']','}','{','}','[','(',')',']'};
        BalancingBrackets balancingBrackets = new BalancingBrackets();
        Assertions.assertTrue(balancingBrackets.isBalanced(input));
    }
}