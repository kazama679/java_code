package ss18;

import java.util.HashMap;

public class B1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> studentsHashmap = new HashMap<>();
        studentsHashmap.put(1, 8);
        studentsHashmap.put(2, 9);
        studentsHashmap.put(3, 10);
        studentsHashmap.put(4, 8);
        studentsHashmap.put(5, 6);
        for(Integer key: studentsHashmap.keySet()) {
            System.out.println("Điểm của sinh viên có key "+key+" là: "+studentsHashmap.get(key));
        }
    }
}
