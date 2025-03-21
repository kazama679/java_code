package ss16;

import java.util.ArrayList;

public class B6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("Danh sách sau khi loại bỏ trùng lặp: " + uniqueNumbers);
    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        return uniqueList;
    }
}
