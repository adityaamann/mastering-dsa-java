import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Example12 {
    public static void main(String[] args) {
        // double-ended queue
        // allows insertion and removal of elements from both ends
        // versatile than regular queues and stacks bcz they can be used as both

        /*
        INSERTION METHODS :
        addFirst(E e) - inserts an element at the front
        addLast(E e) - inserts an element at the end
        offerFirst(E e) - inserts an element at the front, returns true if successful
        offerLast(E e) - inserts an element at the end, returns true if successful


        REMOVAL METHODS :
        removeFirst() - removes and returns the first element
        removeLast() - removes and returns the last element
        pollFirst() - removes and returns the first element, returns null if empty
        pollLast() - removes and returns the last element, returns null if empty


        EXAMINATION METHODS :
        getFirst() - retrieves the first element, throws NoSuchElementException if empty
        getLast() - retrieves the last element, throws NoSuchElementException if empty
        peekFirst() - retrieves the first element without removing it, returns null if empty
        peekLast() - retrieves the last element without removing it, returns null if empty

        STACK METHODS :
        push(E e) - pushes an element onto the stack (equivalent to addFirst)
        pop() - pops an element from the stack (equivalent to removeFirst)

         */

        Deque<Integer> dq = new ArrayDeque<>();   // faster iteration, low memory, no null allowed
        // circular, head and tail
        // no need to shift elements just shift head and tail

        dq.addFirst(10);  // adds 10 at the front
        dq.addLast(20);   // adds 20 at the end
        dq.offerFirst(5);  // adds 5 at the front, returns true
        dq.offerLast(25);   // adds 25 at the end, returns true

        System.out.println("dq: " + dq); // prints the deque

        dq.pollFirst();   // removes the first element, returns null if empty
        dq.pollLast();  // removes the last element, returns null if empty

        System.out.println("After removing first and last: " + dq); // prints the deque after removal

        Deque <Integer> dq2 = new LinkedList<>(); // insertion, deletion somewhere in middle

    }
}
