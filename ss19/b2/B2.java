package ss19.b2;

import java.util.function.Function;

public class B2 {
    public static void main(String[] args) {
        Function<Integer, Integer> f = i -> i*i + 3*i +2;
        System.out.println(f.apply(2));
    }
}
