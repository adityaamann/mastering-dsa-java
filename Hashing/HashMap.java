import java.util.*;
class Main {
    public static void main(String[] args) {
        HashMap<String,Integer>map = new HashMap<>();
        map.put("India",150);
        map.put("USA", 40);
        map.put("China" , 150);

        System.out.println(map);

        map.put("China" , 180);

        System.out.println(map);

        // To get the value associated with a key
        System.out.println(map.get("India"));

        // Check if a key or value exists
        System.out.println(map.containsKey("USA"));
        System.out.println(map.containsValue(150));

        // Iterating through keys and values
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing a key-value pair
        map.remove("China");
        System.out.println(map);
    }

}
