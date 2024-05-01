import java.io.*;

public class practical4 {
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        String content = "Hello World!";

        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println(content);
            System.out.println("Content has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
