package ss18;

import java.util.LinkedHashMap;

public class B3 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> products = new LinkedHashMap<>();
        products.put("Laptop", 40000000.0);
        products.put("Điện thoại", 30000000.0);
        products.put("Chuột", 130000.0);
        products.put("Lót chuột", 110000.0);
        products.put("Dây sạc", 120000.0);
        System.out.println(products);
        // cập nhập
        products.put("Laptop", 50000000.0);
        // xóa
        products.remove("Chuột");
        System.out.println(products);
    }
}
