package ss19.b9;

import java.util.List;

public interface ProductProcessor {
    abstract int calculateTotalValue(List<Product> products);
    static void printProductList(List<Product> products){
        for (Product product : products){
            System.out.println(product.toString());
        }
    }
    default boolean hasExpensiveProduct(List<Product> products){
        for (Product product : products){
            if(product.getPrice()>100){
                return true;
            }
        }
        return false;
    }
}
