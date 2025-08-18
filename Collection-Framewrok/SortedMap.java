import java.util.SortedMap;
import java.util.TreeMap;

public class Example7 {
    public static void main(String[] args) {
        SortedMap<Integer , String> map = new TreeMap<>();
        map.put(1, "Aditya");
        map.put(2, "Arnav");
        map.put(3, "Ashish");

        System.out.println(map);                       // Output: {1=Aditya, 2=Arnav, 3=Ashish}
        System.out.println(map.get(2));                // Output: Arnav
        System.out.println(map.containsKey(3));        // Output: true
        System.out.println(map.containsValue("Aditya")); // Output: true
        System.out.println(map.isEmpty());             // Output: false
        System.out.println(map.size());                // Output: 3
        System.out.println(map.firstKey());            // Output: 1
        System.out.println(map.lastKey());             // Output: 3
        System.out.println(map.headMap(2));      // Output: {1=Aditya}
        System.out.println(map.tailMap(2));    // Output: {2=Arnav, 3=Ashish}
        System.out.println(map.subMap(1, 3));          // Output: {1=Aditya, 2=Arnav}
        map.clear();
        System.out.println("Map after clear: " + map);        // Output: Map after clear: {}
        }
    }
