public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            int element = numbers[6]; 
            System.out.println("Element retrieved: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bound.");
        }
    }
}
