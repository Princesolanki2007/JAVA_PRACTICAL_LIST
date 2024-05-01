public class EvenOddThreadExample {
    public static void main(String[] args) {
	
        Thread evenThread = new Thread(() -> {
            synchronized (System.out) {
                System.out.println("Even Numbers:");
                for (int i = 2; i <= 50; i += 2) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        });
	

        Thread oddThread = new Thread(() -> {
            synchronized (System.out) {
                System.out.println("Odd Numbers:");
                for (int i = 1; i <= 49; i += 2) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        });

        evenThread.start();
        oddThread.start();
    }
}
