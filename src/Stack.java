import java.util.EmptyStackException;

public class Stack {
    static final int MAX = 1000;
    char[] stack = new char[MAX];
    int head;

    Stack() {
        head = -1;
    }

    public int size() {
        return head + 1;
    }

    public void push(char element) {
        stack[++head] = element;
    }

    public char pop() {
        if (head == -1)
            throw new EmptyStackException();
        char poppedElement = stack[head];
        head--;
        return poppedElement;
    }

    public int top() {
        return stack[head];
    }

}
