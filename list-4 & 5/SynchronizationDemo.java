class Counter {
    private int count = 0;

  
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class IncrementerThread extends Thread {
    private Counter c;

    public IncrementerThread(Counter c) {
        this.c= c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        IncrementerThread t1 = new IncrementerThread(c);
        IncrementerThread t2 = new IncrementerThread(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.getCount());
    }
}
