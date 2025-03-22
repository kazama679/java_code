package ss17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        // khởi tạo set từ Set Interface và lớp triển khai HashSet: lưu trữ dữ liệu ngẫu nhiên
        Set<String> setHashSet = new HashSet<>();
        setHashSet.add("Java");
        setHashSet.add("C++");
        setHashSet.add("Python");
        setHashSet.add("HTML");
        System.out.println("dữ liệu sắp xếp ngẫu nhiên: "+setHashSet);

        // khởi tạo set từ INterface và lớp triển khai LinkedHashSet: lưu trữu dữ liệu theo tự thêm vào
        Set<String> setLinked = new LinkedHashSet<>();
        setLinked.add("Java");
        setLinked.add("C++");
        setLinked.add("Python");
        setLinked.add("HTML");
        System.out.println("thứ tự sắp xếp của linkedSet: "+setLinked);

        // khởi tạo set từ Set Interface và triển khai TreeSet: lưu trữ dữ liệu theo thứ tự tự nhiên(tăng dần)
        Set<String> setTreeSet = new TreeSet<>();
        setTreeSet.add("Java");
        setTreeSet.add("C++");
        setTreeSet.add("Python");
        setTreeSet.add("HTML");
        setTreeSet.add("HTML");

        // xóa phần tử
        setTreeSet.remove("HTML");

        // kiểm tra xem có phầm tử hay k
        System.out.println(setTreeSet.contains("HTML"));
        System.out.println("Thứ tự sắp xếp của treeSet: "+setTreeSet);

        //
    }
}
