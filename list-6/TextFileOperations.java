import java.io.*;

public class TextFileOperations {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "Initial content of the file.\nAdditional content appended to the file.";

        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println(content);
            System.out.println("Content has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
