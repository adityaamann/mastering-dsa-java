import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// custom comparator to sort in descending order
class comparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
// ArrayList Example
public class Example {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>(); // making list
            list.add(10); // adding elements in list
            list.add(20);
            list.add(30);
            list.addFirst(200); // adding element at first index
            list.addLast(300);  // adding element at last index
            list.removeLast();  // removing element from last index
            list.add(2,323);   // adding 323 at index 2 by shifting
            list.set(1, 320);  // adding 320 at index 1 by removing
            list.add(10);     // adding same value
            System.out.println(list);   // print list
            System.out.println(list.size());  // print size of list

            for(int x : list){
                System.out.println(x);
            }        // for each loop

            System.out.println(list.contains(20));  // asking (t/f)

            Collections.sort(list);
            System.out.println(list);  // print sorted list

            list.sort(new comparator()); // using custom comparator
            System.out.println(list);  // print list after custom sorting

            list.sort((a,b) -> b - a); // using lambda expression for sorting
            System.out.println(list);  // print list after lambda sorting

            Collections.reverse(list); // reversing the list
            System.out.println(list);  // print reversed list

        }
}





