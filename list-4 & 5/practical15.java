import java.util.Scanner;

public class practical15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Enter the numerator: ");
                double numerator = Double.parseDouble(scanner.nextLine());
                
                System.out.print("Enter the denominator: ");
                double denominator = Double.parseDouble(scanner.nextLine());
                
                if (denominator == 0) {
                    System.out.println("Error: Cannot divide by zero. Try again.");
                    continue;
                }
                
                double result = numerator / denominator;
                
                System.out.println("Result: " + result);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter numeric characters only. Try again.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                break;
            }
        }
        
        scanner.close();
    }
}
