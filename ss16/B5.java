package ss16;

import java.util.ArrayList;
import java.util.HashMap;

public class B5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Số lần xuất hiện của từng phần tử:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " - " + frequencyMap.get(key) + " lần");
        }
    }
}
