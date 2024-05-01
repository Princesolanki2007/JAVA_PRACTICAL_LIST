public class practical4{
    public static void main(String[] args) {
        // Thread to print numbers divisible by 3
        new Thread(() -> {
            System.out.println("Numbers divisible by 3:");
            for (int i = 1; i <= 50; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }).start();

        // Thread to print numbers divisible by 5
        new Thread(() -> {
            System.out.println("Numbers divisible by 5:");
            for (int i = 1; i <= 50; i++) {
                if (i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }).start();
    }
}
