public class RotateString {
    Queue queue = new Queue();

    public char[] rotate(int numberOfRotates, String inputString) {
        char[] resultant = new char[inputString.length()];
        if (numberOfRotates == 0)
            return inputString.toCharArray();
        char[] characterArray = inputString.toCharArray();
        for (char c : characterArray) {
            queue.enqueue(c);
        }
        for (int i = 0; i < numberOfRotates; i++) {
            char front = queue.front();
            queue.enqueue(front);
            queue.dequeue();
        }
        for (int i = 0; i < resultant.length; i++) {
            resultant[i] = queue.front();
            queue.dequeue();
        }
        return resultant;
    }
}
