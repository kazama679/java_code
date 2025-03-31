package ss21.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Validator {
    public static int validateInputInteger(String message, Scanner scanner){
        System.out.println(message);
        while(true) {
            try{
                return Integer.parseInt(scanner.next());
            }catch(NumberFormatException ex){
                System.out.println("Dữ liệu nhập vào k phải số nguyên");
            }
        }
    }

    public static LocalDate validateInputDate(String message, Scanner scanner){
        System.out.println(message);
        while (true){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try{
                return LocalDate.parse(scanner.nextLine(), dtf);
            }catch (DateTimeParseException e){
                System.out.println("k đúng định dạng ngày tháng, nhập lại");
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

//    public static String ValidateLengthString(String message, Scanner scanner, int min, int max){
//        System.out.println(message);
//        while(true){
//
//        }
//    }
}
