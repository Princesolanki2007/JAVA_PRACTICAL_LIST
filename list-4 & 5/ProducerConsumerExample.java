import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Queue<Integer> buffer = new LinkedList<>();
        int maxSize = 10;

        Thread producer = new Thread(() -> {
            Random random = new Random();
            while (true) {
                synchronized (buffer) {
                    if (buffer.size() >= maxSize) try { buffer.wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                    buffer.add(random.nextInt(100));
                    System.out.println("Produced");
                    buffer.notify();
                }
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                synchronized (buffer) {
                    if (buffer.isEmpty()) try { buffer.wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                    System.out.println("Consumed");
                    buffer.poll();
                    buffer.notify();
                }
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        producer.start();
        consumer.start();
    }
}
