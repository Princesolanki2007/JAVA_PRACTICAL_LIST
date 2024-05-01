import java.util.Scanner;

public class practical16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            while (true) {
                System.out.print("Enter the numerator: ");
                double numerator = Double.parseDouble(scanner.nextLine());
                
                System.out.print("Enter the denominator: ");
                double denominator = Double.parseDouble(scanner.nextLine());
                
                System.out.println("Result: " + (numerator / denominator));
                break;
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
