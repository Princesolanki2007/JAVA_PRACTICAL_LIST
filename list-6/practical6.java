import java.io.*;

public class practical6{
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        String newLine = "Java Programming is awesome!";
        
        try {
            // Open the file in append mode
            FileWriter fileWriter = new FileWriter(fileName, true);
            // Create a BufferedWriter for efficient writing
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            // Create a PrintWriter to write text to the BufferedWriter
            PrintWriter writer = new PrintWriter(bufferedWriter);
            
            // Append the new line to the file
            writer.println(newLine);
            
            // Close the resources
            writer.close();
            bufferedWriter.close();
            fileWriter.close();
            
            System.out.println("New line has been appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
