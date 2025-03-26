package ss19.default_static_mothod;

import java.util.Scanner;

public interface IApplication {
    void inputData(Scanner scanner);
    void displayData();
    default void sayHello(String name){
        System.out.println("Xin chào "+name);
    }

    static int addTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
