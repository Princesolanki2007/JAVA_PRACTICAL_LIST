public class MultiThreadExample {
    public static void main(String[] args) {
        startThread("Thread-I", 2500);
        startThread("Thread-II", 5000);
        startThread("Thread-III", 7500);
    }

    public static void startThread(String name, long interval) {
        new Thread(() -> {
            while (true) {
                System.out.println(name);
                try {
                    Thread.sleep(interval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
