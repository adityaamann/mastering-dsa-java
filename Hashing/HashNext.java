import java.util.*;
public class HashNext {
    public static void main(String[] args) {
       HashSet<Integer> set = new HashSet();
         // Adding elements to the HashSet
         set.add(1);
         set.add(2);
         set.add(3);
         set.add(1);

         // Removing an element from the HashSet
         set.remove(2);

         // Checking if an element is present in the HashSet
         if(set.contains(2))
            {
                System.out.println("Element 2 is present in the HashSet");
            } else {
                System.out.println("Element 2 is not present in the HashSet");
            }

         // Checking if an element is present in the HashSet
         Iterator it = set.iterator();
         while (it.hasNext()) {
             System.out.println(it.next());
            }
    }
}
