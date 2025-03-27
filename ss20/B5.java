package ss20;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class B5 {
    public static void main(String[] args) {
        List<Integer> normalList = List.of(10, 5, 8, 20, 7);
        List<Integer> singleElementList = List.of(10);
        List<Integer> allSameList= List.of(10, 10, 10);
        Optional<Integer> optional1 = normalList.stream().distinct().sorted(Comparator.comparing(Integer::byteValue).reversed()).skip(1).findFirst();
        Optional<Integer> optional2 = singleElementList.stream().distinct().sorted(Comparator.comparing(Integer::byteValue).reversed()).skip(1).findFirst();
        Optional<Integer> optional3 = allSameList.stream().distinct().sorted(Comparator.comparing(Integer::byteValue).reversed()).skip(1).findFirst();
        if(optional1.isPresent()) {
            System.out.println("normalList: "+optional1.get());
        }else{
            System.out.println("Không tìm thấy số lớn thứ hai");
        }
        if(optional2.isPresent()) {
            System.out.println("singleElementList: "+optional2.get());
        }else{
            System.out.println("Không tìm thấy số lớn thứ hai");
        }
        if(optional3.isPresent()) {
            System.out.println("allSameList: "+optional3.get());
        }else{
            System.out.println("Không tìm thấy số lớn thứ hai");
        }
    }
}
