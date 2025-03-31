package ss21.b10;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Validator extends Exception {
    public Validator(String message) {
        super(message);
    }

    public static void validNumber(int n) throws Validator {
        if(n<=0){
            throw new Validator("K đc nhỏ hơn 1");
        }
    }

    public static void validProduct(String id) throws Validator {
        OptionalInt index = IntStream.range(0, B10.products.size()).filter(i->B10.products.get(i).getId().equals(id)).findFirst();
        if(index.isEmpty()){
            throw new Validator("Vui lòng nhập đúng id");
        }
    }
}
