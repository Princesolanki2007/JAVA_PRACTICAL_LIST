public class EvenOddThreadExample1 {
    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
	System.out.println("Even Thread :");
            for (int i = 0; i <= 100; i += 2) {
                System.out.print(" " + i);
            }
        });

        Thread oddThread = new Thread(() -> {
	System.out.println("Odd Thread :");
            for (int i1 = 1; i1 <= 100; i1 += 2) {
                System.out.print("  " + i1);
            }
        });

       evenThread.start();
	 oddThread.start(); 
       
    }
}
