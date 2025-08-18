import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Example10 {
    public static void main(String[] args) {
        // Queue -> FIFO (First In First Out)
        Queue<Integer> list = new LinkedList<>();
        list.add(1);    // enqueue
        list.add(2);    // enqueue
        list.add(3);     // enqueue
        System.out.println(list);
        Integer i = list.remove();     // dequeue
        System.out.println(i);
        System.out.println(list);
        System.out.println(list.peek());    // peek
        System.out.println(list.poll());     // poll
        System.out.println(list);

        Queue<Integer> queue = new ArrayBlockingQueue<>(2);
        System.out.println(queue.add(1));   // True
        System.out.println(queue.offer(2));   // True
        System.out.println(queue.offer(3)); // False

    }
}
