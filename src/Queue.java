import java.util.NoSuchElementException;

public class Queue {
    private static int rear;
    private static int front;

    private char[] queueArray = new char[100];

    public Queue() {
        setFront(0);
        setRear(0);
    }

    public static int getRear() {
        return rear;
    }

    public static void setRear(int rear) {
        Queue.rear = rear;
    }

    public static int getFront() {
        return front;
    }

    public static void setFront(int front) {
        Queue.front = front;
    }

    public int size() {
        return getRear() - getFront();
    }

    public char front() {
        return getQueueArray()[getFront()];
    }

    public void enqueue(char element) {
        getQueueArray()[getRear()] = element;
        setRear(getRear() + 1);
    }

    public void dequeue() {
        if (getRear() == getFront())
            throw new NoSuchElementException();
        getQueueArray()[getFront()] = 0;
        setFront(getFront() + 1);
    }

    public void showQueue() {
        for (char c : getQueueArray()) {
            System.out.print(c);
        }
    }

    public char[] getQueueArray() {
        return queueArray;
    }

    public void setQueueArray(char[] queueArray) {
        this.queueArray = queueArray;
    }
}
