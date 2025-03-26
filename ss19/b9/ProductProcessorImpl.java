package ss19.b9;

import java.util.List;

public class ProductProcessorImpl implements ProductProcessor{
    @Override
    public int calculateTotalValue(List<Product> products) {
        int count =0;
        for (Product product : products){
            count += product.getPrice();
        }
        return count;
    }
}
