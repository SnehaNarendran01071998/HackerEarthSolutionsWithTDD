import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

class StackTest {
    @Test
    void shouldReturnTheSizeAsZeroWhenStackIsEmpty() {
        Stack stack = new Stack();
        int size = stack.size();
        Assertions.assertEquals(0, size);
    }

    @Test
    void shouldReturnTheSizeAsOneWhenAnItemIsPushed() {
        Stack stack = new Stack();
        char element = 'a';
        stack.push(element);
        int size = stack.size();
        Assertions.assertEquals(1, size);
    }

    @Test
    void shouldReturnTheSizeAsOneWhenAnOneOutOfTwoItemsIsPopped() {
        Stack stack = new Stack();
        char firstElement = 'a';
        char secondElement = 'b';
        stack.push(firstElement);
        stack.push(secondElement);
        char poppedElement = stack.pop();
        Assertions.assertEquals('b', poppedElement);
        int size = stack.size();
        Assertions.assertEquals(1, size);
        Assertions.assertEquals('a', stack.top());
    }

    @Test
    void shouldThrowExceptionWhileTryingToPopFromEmptyStack() {
        Stack stack = new Stack();
        try {
            stack.pop();
        } catch (EmptyStackException emptyStackException) {
            emptyStackException.printStackTrace();
        }
    }
}