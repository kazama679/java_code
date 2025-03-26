package ss19.b8;

import java.util.List;
import java.util.function.Predicate;

public interface ListProcessor {
    abstract int sumOddNumbers(List<Integer> list);
    static void printList(List<Integer> list){
        for (Integer i : list){
            System.out.println(i);
        }
    }
    default void checkOdd(List<Integer> list) {
        boolean flag = false;
        for (Integer i : list){
            Predicate<Integer> isOdd = n -> n % 2 != 0;
            if (isOdd.test(i)){
                System.out.print(i+" ");
                flag = true;
            }
        }
        if (!flag){
            System.out.println("K có phần tử ");
        }
    }
}