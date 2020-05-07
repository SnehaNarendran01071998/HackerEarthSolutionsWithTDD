import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class QueueTest {
    @Test
    void shouldReturnFrontOfTheQueueAsNullIfQueueIsEmpty() {
        Queue queue = new Queue();
        char front = queue.front();
        Assertions.assertEquals(0, front);
    }

    @Test
    void shouldReturnFrontOfQueueAsTheFirstElementEnqueued() {
        Queue queue = new Queue();
        char firstElement = 'a';
        queue.enqueue(firstElement);
        char front = queue.front();
        Assertions.assertEquals('a', front);
    }

    @Test
    void shouldReturnFrontOfQueueWhenTwoElementsAreEnqueued() {
        Queue queue = new Queue();
        char firstElement = 'a';
        queue.enqueue(firstElement);
        char secondElement = 'b';
        queue.enqueue(secondElement);
        char front = queue.front();
        Assertions.assertEquals('a', front);
    }

    @Test
    void shouldReturnFrontOfQueueWhenTwoElementsAreEnqueuedAndAnElementIsDequeue() {
        Queue queue = new Queue();
        char firstElement = 'a';
        queue.enqueue(firstElement);
        char secondElement = 'b';
        queue.enqueue(secondElement);
        queue.dequeue();
        char front = queue.front();
        Assertions.assertEquals('b', front);
    }

    @Test
    void shouldThrowExceptionWhenDequeueAnEmptyQueue() {
        Queue queue = new Queue();
        Assertions.assertThrows(NoSuchElementException.class, queue::dequeue);
    }


}