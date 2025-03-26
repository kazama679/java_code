package ss19.b6;

import java.util.List;

public interface IStringProcessor {
    abstract String processString(String input);
    default void printList(List<String> list){
        list.forEach(System.out::println);
    };
}
