import java.util.LinkedHashMap;
public class Example6 {
    public static void main(String[] args) {
        // LinkedHashMap maintains the insertion order of elements
        // It is a combination of HashMap and LinkedList
        // It allows null values and one null key
        // It is not synchronized, so it is not thread-safe
        // It is used when we want to maintain the order of elements
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Aditya");
        map.put(2, "Bharat");
        map.put(3, "Chaitanya");
        map.put(4, "Dinesh");

        System.out.println(map);

        for(var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }
}
