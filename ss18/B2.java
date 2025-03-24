package ss18;

import java.util.HashMap;
import java.util.Map;

public class B2 {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();
        products.put("Laptop", 10000000.0);
        products.put("Điện thoại", 1000.0);
        System.out.println("Kiểm tra xem có sản phẩm Laptop hay k: "+products.containsKey("Laptop"));
        boolean check=false;
        for (String key : products.keySet()) {
            if(products.get(key)==1000) {
                check=true;
                break;
            }
        }
        System.out.println("Kiểm tra xem có sản phẩm giá 1000 hay k: "+check);
    }
}
