import java.util.concurrent.ConcurrentHashMap;
public class Example8 {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        // Java 7 -> segment based locking --> 16 segments --> smaller Hashmaps
        // only one segment is locked at a time
        // Java 8 -> lock-free algorithm --> no segments --> entire map is locked
        // when a thread is writing to the map, other threads can still read from it

    }
}
