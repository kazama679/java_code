package ss19.functional_lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // cách 1: k sửa dụng biểu thức lambda
        IMath imath1 = new IMath() {
            @Override
            public int addTwoNumbers(int firstNumber, int secondNumber) {
                return firstNumber + secondNumber;
            }
        };
        System.out.println("Tổng 2 số 5 và 10 là: "+imath1.addTwoNumbers(5,10));
        // cách 2: sử dụng biểu thức lambda
        IMath imath2 = (a, b) -> {
            return a + b;
        };
        System.out.println("Tổng 2 số 10 và 15 là: "+imath2.addTwoNumbers(10,15));
        // cách 3: Sử dụng biểu thức lambda khi khối lệnh chỉ có 1 câu lệnh
        IMath iMath3 = (a, b)-> a + b;
        System.out.println("tổng 2 số 30 và 15 là: "+iMath3.addTwoNumbers(15,30));
        // cách 4: sử dụng lambda + method reference
        IMath iMath4 = Integer::sum;
        System.out.println("Tổng 2 số 50 và 100 là: "+iMath4.addTwoNumbers(50,100));

        // sử dụng biểu thức lambda trong vòng lặp
        List<String> listString = Arrays.asList("A", "B", "C");
        // cách thông thường
        for (String str : listString) {
            System.out.println(str);
        }
        // sử dụng biểu thức lambda trong vòng lặp
        listString.forEach(str -> System.out.println(str));
        // sử dụng lambda để sắp xếp
        Collections.sort(listString, (a, b)->a.compareTo(b));
    }
}
