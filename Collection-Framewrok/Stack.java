import java.util.Stack;
public class Example3 {
    public static void main(String[] args) {
        // LIFO -> LastInFirstOut
        Stack<Integer> stack = new Stack<>();   // Create a stack of integers
        // Push elements onto the stack
        stack.push(10);  // 5
        stack.push(20);  // 4
        stack.push(30);  // 3
        stack.push(40);  // 2
        stack.push(50);  // 1

        stack.pop();// Remove the top element from the stack
        Integer peek = stack.peek(); // Get the top element without removing it
        System.out.println(stack);  // Print the current state of the stack
        System.out.println(peek); // Call the peek method to get the top element

        boolean empty = stack.isEmpty();
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Check if the stack is empty
        System.out.println(stack.size());  // Print the size of the stack

        stack.search(20); // Search for an element in the stack
        System.out.println("Position of 20 in the stack: " + stack.search(20)); // Print the position of the element


    }
}
