import java.util.NoSuchElementException;

public class Queue {
    char[] queue = new char[100];
    int front, rear;

    public Queue() {
        this.front = 0;
        this.rear = 0;
    }

    public char front() {
        return queue[front];
    }

    public void enqueue(char element) {
        queue[rear] = element;
        rear++;
    }

    public void dequeue() {
        if (rear == front)
            throw new NoSuchElementException();
        queue[front] = 0;
        front++;
    }
}
