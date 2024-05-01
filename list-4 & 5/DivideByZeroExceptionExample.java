public class DivideByZeroExceptionExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator; // Attempting to divide by zero
            System.out.println("Result: " + result); // This line won't be executed if exception occurs
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero."); // Display error message
        }
    }
}
