package ss16;

import java.util.ArrayList;

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
        System.out.println("Số lần xuất hiện của từng phần tử:");
        ArrayList<Integer> counted = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (!counted.contains(num)) {
                int count = 0;
                for (int j = 0; j < numbers.size(); j++) {
                    if (numbers.get(j) == num) {
                        count++;
                    }
                }
                System.out.println(num + " - " + count + " lần");
                counted.add(num); 
            }
        }
    }
}
