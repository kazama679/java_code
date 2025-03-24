package ss18;

import java.util.*;

public class Mapdemo {
    public static void main(String[] args) {
        Map<Integer, String> studentsHashmap = new HashMap<Integer, String>();
        studentsHashmap.put(1, "Nguyễn Văn A");
        studentsHashmap.put(1, "Nguyễn Văn B");
        studentsHashmap.put(2, "Nguyễn Văn C");
        studentsHashmap.put(3, "Nguyễn Văn D");
        System.out.println(studentsHashmap);

        // LinkedHashMap: Lưu trữ theo thứ tự trèn
        Map<Integer, String> studentLinkedHashMap = new LinkedHashMap<>();
        studentLinkedHashMap.put(1, "Nguyễn Văn A");
        studentLinkedHashMap.put(2, "Nguyễn Văn B");
        studentLinkedHashMap.put(3, "Nguyễn Văn C");
        System.out.println(studentLinkedHashMap);

        // TreeMap lưu trữ thoe thứ tự tự nhiên, key tăng dần
        Map<Integer, String> studentTreeMap = new TreeMap<>();
        studentTreeMap.put(1, "Nguyễn Văn A");
        studentTreeMap.put(3, "Nguyễn Văn C");
        studentTreeMap.put(2, "Nguyễn Văn B");
        System.out.println(studentTreeMap);

        //2. Value get(Object key): lấy giá trị value theo key
        System.out.println("Value của key = 2 là: "+studentsHashmap.get(2));
        //3. xóa phần tử theo key
        studentsHashmap.remove(2);
        System.out.println(studentsHashmap);
        // 4. boolean containsKey() kiểm tra trong map có tồn tại key k
        System.out.println("Kiểm tra hashmap có tồn tại key=1 k: "+studentsHashmap.containsKey(1));
        // 5. Set<Key> keySet(): trả về 1 Set gồm các Key trong Map
        Set<Integer> set = studentsHashmap.keySet();
        System.out.println("SET KEY: "+set);
        // 6. Collections values(): trả về 1 collection chứa các giá trị value trong Map
        Collection<String> listValues = studentsHashmap.values(); // ép về kiểm list string
        System.out.println("LIST VALUES: "+listValues);
        //7. Duyệt Map và in ra các thông tin
        for (Map.Entry<Integer, String> entry : studentsHashmap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //8. duyệt Map với keySet
        System.out.println("Duyệt Map vs phương thức keySet: ");
        for (Integer key: studentsHashmap.keySet()) {
            System.out.println(key + " : " + studentsHashmap.get(key));
        }
        //9.. duyệt Map với values()
        System.out.println("Duyệt mảng với thương thức values: ");
        for(String value: studentsHashmap.values()) {
            System.out.println(value);
        }
    }
}
