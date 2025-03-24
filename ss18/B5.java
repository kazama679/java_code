package ss18;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class B5 {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<String, Double>();
        products.put("Laptop", 2000.0);
        products.put("Đt", 1000.0);
        products.put("bàn học", 500.0);
        TreeMap<String, Double> treeMap = new TreeMap<String, Double>();
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if(entry.getValue() >= 500 && entry.getValue() <= 1500) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println("Sản phẩm đã lọc, và sắp xếp tăng dần: "+treeMap);
    }
}
