import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Example13 {
    public static void main(String[] args) {
        // thread safe queue
        //wait for queue to be empty / wait for space
        // simplify concurrency problems like producer/consumer
        // standard queue --> immediately
             // empty --> remove(no waiting
             // full --> add(no waiting)
        // BlockingQueue
        // put --> wait for space
        // take --> wait for item
        // offer --> try to add, return false if full
        // poll --> try to remove, return null if empty

        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(5);
        // A bounded, blocking queue backed by an array.
        // It has a fixed capacity and will block when trying to add elements if the queue is full,
        // or when trying to remove elements if the queue is empty.

        // Producer
        Runnable producer = () -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    bq.put(i); // waits if full
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Consumer
        Runnable consumer = () -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    int item = bq.take(); // waits if empty
                    System.out.println("Consumed: " + item);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
// This code demonstrates a simple producer-consumer scenario using a BlockingQueue.
// The producer adds integers to the queue, while the consumer removes them.
// The BlockingQueue handles the synchronization, allowing the producer to wait if the queue is full
// and the consumer to wait if the queue is empty, thus avoiding concurrency issues.
// The output will show the produced and consumed items in the order they are processed.
// Note: The order of produced and consumed items may vary due to the nature of threading.
// To see the effect, you can run the code multiple times, and you will notice that
// the produced items may not always match the consumed items in a strict sequence,
// but they will always be in the range of 1 to 10, demonstrating the producer-consumer relationship.
// The BlockingQueue ensures that the producer and consumer operate correctly without running into issues
// such as trying to consume from an empty queue or producing to a full queue.
