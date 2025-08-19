import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

class DelayedTask implements Delayed {
    private final String name;
    private final long startTime;

    public DelayedTask(String name, long delayInSeconds) {
        this.name = name;
        this.startTime = System.currentTimeMillis() + delayInSeconds * 1000;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
    }

    @Override
    public String toString() {
        return name;
    }
}

public class DelayQueueExample {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedTask> queue = new DelayQueue<>();

        queue.put(new DelayedTask("Task 1", 5));  // after 5 sec
        queue.put(new DelayedTask("Task 2", 2));  // after 2 sec
        queue.put(new DelayedTask("Task 3", 7));  // after 7 sec

        while (!queue.isEmpty()) {
            DelayedTask task = queue.take(); // blocks until delay expires
            System.out.println("Executed: " + task + " at " + System.currentTimeMillis() / 1000);
        }
    }
}
