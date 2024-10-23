public import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {

    public static void main(String[] args) {
        // File paths
        String byteInputFilePath = "input.dat"; // Input file for byte stream
        String byteOutputFilePath = "output.dat"; // Output file for byte stream
        String charInputFilePath = "input.txt"; // Input file for character stream
        String charOutputFilePath = "output.txt"; // Output file for character stream

        // Writing bytes to a file
        writeBytesToFile(byteOutputFilePath, "Hello, Byte Stream!");

        // Reading bytes from a file
        System.out.println("Reading bytes from file:");
        readBytesFromFile(byteInputFilePath);

        // Writing characters to a file
        writeCharsToFile(charOutputFilePath, "Hello, Character Stream!");

        // Reading characters from a file
        System.out.println("Reading characters from file:");
        readCharsFromFile(charInputFilePath);
    }

    // Method to write bytes to a file
    public static void writeBytesToFile(String filePath, String data) {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(data.getBytes()); // Convert string to bytes and write
            System.out.println("Data written to byte file: " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing to byte file: " + e.getMessage());
        }
    }

    // Method to read bytes from a file
    public static void readBytesFromFile(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int data;
            while ((data = fis.read()) != -1) { // Read one byte at a time
                System.out.print((char) data); // Print as character
            }
            System.out.println(); // New line after reading
        } catch (IOException e) {
            System.out.println("Error reading from byte file: " + e.getMessage());
        }
    }

    // Method to write characters to a file
    public static void writeCharsToFile(String filePath, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data); // Write characters
            System.out.println("Data written to character file: " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing to character file: " + e.getMessage());
        }
    }

    // Method to read characters from a file
    public static void readCharsFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) { // Read line by line
                System.out.println(line); // Print each line
            }
        } catch (IOException e) {
            System.out.println("Error reading from character file: " + e.getMessage());
        }
    }
}
 {
    
}
