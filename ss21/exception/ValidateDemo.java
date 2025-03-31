package ss21.exception;

import ss21.util.Validator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ValidateDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate bod = Validator.validateInputDate("Nhập vào ngày sinh của bạn", sc);
        System.out.println("Ngày sinh của bạn: "+bod);
    }
}
