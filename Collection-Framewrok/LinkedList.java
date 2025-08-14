import java.util.LinkedList;
import java.util.function.Predicate;
public class Example2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(); // making list
        linkedList.add(10); // adding elements in list
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(200); // adding element at first index
        linkedList.addLast(300);  // adding element at last index
        linkedList.removeLast();  // removing element from last index
        linkedList.add(2, 323);   // adding 323 at index 2 by shifting
        linkedList.set(1, 320);  // adding 320 at index 1 by removing
        linkedList.add(10);     // adding same value
        System.out.println(linkedList);   // print list
        System.out.println(linkedList.size());  // print size of list

        for(int x : linkedList){
            System.out.println(x);
        }        // for each loop

        linkedList.removeIf(x -> x%2 == 0); // removing even numbers using lambda expression
        System.out.println(linkedList);  // print list after removing even numbers
    }
  }
