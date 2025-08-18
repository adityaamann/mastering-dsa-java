import java.util.PriorityQueue;
public class Example11 {
    public static void main(String[] args) {
        // part of the queue interface
        // order element based on their natural ordering (for primitives lowest first)
        // custom comparator for customised ordering
        // does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(5);
        System.out.println("Most Priority element: " + pq.peek());
        pq.remove();
        System.out.println("Most Priority element after removal: " + pq.peek());

        pq.add(30);
        System.out.println(pq);

        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());
        }

        // internal working
        // PriorityQueue is implemented as a min-heap by default (for natural ordering)

    }
}
