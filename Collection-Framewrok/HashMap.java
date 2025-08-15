import java.util.HashMap;
public class Example5 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();  // Create a HashMap to store key-value pairs
        map.put("name", "Aditya");     // Add key-value pairs to the map
        map.put("city", "Jaipur");
        map.put("language" , "Java");

        System.out.println(map);  // Print the map

        System.out.println(map.get("name"));    // Retrieve and print the value associated with the key "name"
        System.out.println(map.get("city"));
        System.out.println(map.get("language"));

        System.out.println("Map size: " + map.size());  // Print the size of the map

        for(String key : map.keySet()){              // Iterate through the keys in the map
            System.out.println(key + "->" + map.get(key));
        }

        map.remove("city");                // Remove the key "city" and its associated value from the map

        System.out.println(map.containsKey("name"));            // Check if the map contains the key "name"
        System.out.println(map.containsValue("Java"));          // Check if the map contains the value "Java"

        map.put("language", "python");         // Update the value associated with the key "language"
        System.out.println(map.get("language"));     // Print the updated value for "language"


        map.clear();               // Clear all entries from the map
        System.out.println("Map size after clearing: " + map.size());  // Print the size of the map after clearing it
    }
}
