import java.util.concurrent.CopyOnWriteArrayList;
public class Example4 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        // "CopyOnWriteArrayList" is a thread-safe variant of ArrayList
        // "Copy on write" means that whenever a write operation occurs,
        // like adding or removing an element,
        // instead of modifying the existing list,
        // a new copy of the list is created, and the operation is performed on that copy.
        // this ensures that readers can always access a consistent view of the list,
        // even while write operations are happening concurrently.

        // Read operation: Fast and direct, since they happen on the stable list without interference from modifications.
        // Write operation: A new copy of the list is created, which can be more expensive in terms of memory and performance,


    }
}
