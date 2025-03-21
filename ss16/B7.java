package ss16;

import java.util.ArrayList;

public class B7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(3);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(1);
        numbers.add(11);

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        ArrayList<Integer> duplicateNumbers = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int count = 1;
            if (!duplicateNumbers.contains(numbers.get(i)) && !uniqueNumbers.contains(numbers.get(i))) {
                for (int j = i + 1; j < numbers.size(); j++) {
                    if (numbers.get(i).equals(numbers.get(j))) {
                        count++;
                    }
                }
                if (count > 1) {
                    duplicateNumbers.add(numbers.get(i));
                    counts.add(count);
                } else {
                    uniqueNumbers.add(numbers.get(i));
                }
            }
        }

        System.out.println("Phần tử xuất hiện đúng 1 lần: " + uniqueNumbers);
        System.out.println("Phần tử trùng lặp và số lần xuất hiện:");
        for (int i = 0; i < duplicateNumbers.size(); i++) {
            System.out.println(duplicateNumbers.get(i) + " xuất hiện " + counts.get(i) + " lần");
        }
    }
}
