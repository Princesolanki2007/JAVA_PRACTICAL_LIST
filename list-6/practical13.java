import java.io.*;

public class practical13 {
    public static void main(String[] args) {
        String directoryName = "myDirectory";
        String fileName = "myFile.txt";

        File directory = new File(directoryName);
        if (!directory.exists() && directory.mkdir()) {
            System.out.println("Directory created.");
        }

        if (new File(fileName).renameTo(new File(directory, fileName))) {
            System.out.println("File moved to directory.");
        } else {
            System.out.println("Failed to move the file.");
        }
    }
}
