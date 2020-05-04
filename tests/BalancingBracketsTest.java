import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalancingBracketsTest {
    @Test
    void shouldReturnFalseForAnEmptyString() {
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
}