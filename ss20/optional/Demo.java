package ss20.optional;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        //1. khởi tạo Optional
        Optional<String> optionalStr1 = Optional.of("KS23B");
        Optional<String> optionalStr2 = Optional.empty();
        Optional<String> optionalStr3 = Optional.ofNullable(null);
        System.out.println("optionalStr1: "+optionalStr1.get());
        if(optionalStr2.isPresent()) {
            System.out.println("optionalStr2: "+optionalStr2.get());
        }
        System.out.println("optionalStr2: "+optionalStr2.orElse("Mặc định"));
        optionalStr3.ifPresent(System.out::println);
    }
}
