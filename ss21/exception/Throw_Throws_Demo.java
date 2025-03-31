package ss21.exception;

import java.util.Scanner;

public class Throw_Throws_Demo {
    public static void main(String[] args) throws CustomException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp vào số thứ 1:");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Nhâp vào số thứ 2:");
        int secondNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Kết quả: "+divTwoNumbers(firstNumber, secondNumber));
    }

    public static int divTwoNumbers(int firstNumber, int secondNumber) throws CustomException {
        return firstNumber / secondNumber;
    }
}