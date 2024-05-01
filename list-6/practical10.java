import java.io.*;

public class practical10 {
    public static void main(String[] args) {
        String fileName = "myData.csv";
        String searchName = "David Lee";
        int newAge = 21;

        // Read the content of the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts[0].equals(searchName)) {
                    parts[1] = String.valueOf(newAge);
                    line = String.join(", ", parts);
                }
                content.append(line).append("\n");
            }
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(content.toString());
            fileWriter.close();
            System.out.println("Age of 'David Lee' has been updated to " + newAge + " in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
