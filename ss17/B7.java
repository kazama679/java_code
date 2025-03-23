package ss17;

import java.util.*;

public class B7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đoạn văn bản:");
        String text = scanner.nextLine().toLowerCase();
        String[] words = text.split("\\W+");
        Set<String> uniqueWords = new TreeSet<>(Arrays.asList(words));
        Map<String, Integer> wordCount = new TreeMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Các từ không trùng lặp: " + uniqueWords);
        System.out.println("Tần suất xuất hiện của từng từ:");
        List<String> keys = new ArrayList<>(wordCount.keySet());
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            System.out.println(key + ": " + wordCount.get(key));
        }
    }
}
