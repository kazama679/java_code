package ss22;

import java.io.*;

public class B6 {
    public static void main(String[] args) {
        String content = "Bài 6";
        writeToFile("input.txt", content);
        copyFile("input.txt", "copy.txt");
        readFromFile("copy.txt");
    }

    public static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(String sourceFile, String destFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String reversedLine = new StringBuilder(line).reverse().toString();
                writer.write(reversedLine);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Nội dung file " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
