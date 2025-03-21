package ss16;

import java.util.ArrayList;

public class B8 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("banana");
        words.add("apple");
        words.add("pear");
        words.add("kiwi");
        words.add("grape");

        System.out.println("Danh sách trước khi sắp xếp: " + words);

        for (int i = 0; i < words.size() - 1; i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).length() > words.get(j).length() ||
                        (words.get(i).length() == words.get(j).length() && words.get(i).compareTo(words.get(j)) > 0)) {
                    String temp = words.get(i);
                    words.set(i, words.get(j));
                    words.set(j, temp);
                }
            }
        }

        System.out.println("Danh sách sau khi sắp xếp: " + words);
    }
}
