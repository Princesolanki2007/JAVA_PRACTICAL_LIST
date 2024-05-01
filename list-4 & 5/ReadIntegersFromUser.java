import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadIntegersFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (enter a non-numeric value to stop):");

        while (true) {
            try {
                int number = scanner.nextInt(); 
                System.out.println("You entered: " + number);
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer.");
                break; 
            }
        }

        scanner.close();
    }
}
