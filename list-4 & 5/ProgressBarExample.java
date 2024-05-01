public class ProgressBarExample {
    public static void main(String[] args) {
        System.out.println("Task started...");
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(200); // Simulate a long-running task by sleeping
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\rProgress: [" + repeat("#", i) + repeat(" ", 100 - i) + "] " + i + "%");
        }
        System.out.println("\nTask completed!");
    }

    private static String repeat(String str, int n) {
        return str.repeat(n);
    }
}
