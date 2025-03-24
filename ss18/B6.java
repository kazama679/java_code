package ss18;

import java.util.LinkedHashMap;

public class B6 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Double> students = new LinkedHashMap<>();
        students.put(1, 8.0);
        students.put(2, 8.2);
        students.put(3, 8.3);
        students.put(4, 4.4);
        students.put(5, 8.5);
        students.put(6, 9.6);
        students.put(7, 9.7);
        students.put(8, 9.8);
        students.put(9, 9.9);
        students.put(10, 9.1);
        System.out.println(students);
        double avg = 0;
        for (Integer key : students.keySet()) {
            avg += students.get(key);
        }
        avg = avg / students.size();
        System.out.println("Điểm trung bình của tất cả sv: "+avg);
        for(int i=1; i<=students.size(); i++) {
            if(students.get(i)<5){
                students.remove(i);
            }
        }
        System.out.println(students);
    }
}