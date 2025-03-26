package ss19.b9;

import java.util.*;

public class B9 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop",120),
                new Product("Điện thoại",150),
                new Product("Chuột",5)
        );
        ProductProcessorImpl processor = new ProductProcessorImpl();
        if(processor.hasExpensiveProduct(products)){
            for(Product product : products){
                if(product.getPrice()>100){
                    System.out.println(product);
                }
            }
        }else{
            System.out.println("Không có sản phẩm đắt tiền");
        }
        System.out.println("Tổng giá trị tất cả sản phẩm: "+processor.calculateTotalValue(products));
        ProductProcessor.printProductList(products);
    }
}
