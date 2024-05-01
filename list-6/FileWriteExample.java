import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String fileName = "output.txt"; // Name of the file to be created

        // Text content to be written to the file
        String content = "This is some text content that will be written to the file.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Writing content to the file
            writer.write(content);

            System.out.println("Content has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
