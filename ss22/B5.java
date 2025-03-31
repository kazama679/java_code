package ss22;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class B5 {
    public static void main(String[] args) {
        String fileName = "Văn Lâm, Tiến Linh, Xuân Son, Hoàng Đức, Văn Hậu";
        writeToFile(fileName);
        readFromFile();
    }

    public static void writeToFile(String name) {
        File file = new File("input.txt");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(name);
            oos.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void readFromFile() {
        File file = new File("input.txt");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            String content = (String) ois.readObject();
            String[] words = content.split(", ");
            List<String> listWords = Arrays.asList(words);
            String longestWord = listWords.stream().max((a, b) -> Integer.compare(a.length(), b.length())).orElse("");
            System.out.println("Từ dài nhất: " + longestWord);
            System.out.println("Độ dài: " + longestWord.length());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
