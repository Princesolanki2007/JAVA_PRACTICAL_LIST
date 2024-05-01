import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "Hello, this is some content written to the file.\nThis is the second line of the file content.";


        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println(content);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Read from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Contents of the file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}
