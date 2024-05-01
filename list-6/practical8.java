import java.io.*;

public class practical8{
    public static void main(String[] args) {
        String fileName = "myData.csv";
        String[] data = {
            "Name, Age, Gender",
            "John Doe, 25, Male",
            "John Smith, 30, Female",
            "David Lee, 20, Male"
        };

        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (String line : data) {
                writer.println(line);
            }
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
