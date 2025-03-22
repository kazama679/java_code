package ss17.deHackathon2.validate;

import java.util.Scanner;

public class Validator {
    public static String validateString(Scanner scanner, int min, int max) {
        while (true){
            String input = scanner.nextLine();
            if(input.length() >= min && input.length() <= max){
                return input;
            }
            System.out.println("Dữ liệu nhập k hợp lệ, nhập lại!");
        }
    }

    public static int validateInt(Scanner scanner, int min) {
        while (true){
            if(!scanner.hasNextInt()){
                System.out.println("K p so, nhap lai");
                continue;
            }
            int input = Integer.parseInt(scanner.nextLine());
            if(input < min){
                System.out.println("Ko được nhỏ hơn "+ min);
                continue;
            }
            return input;
        }
    }

    public static double validateDouble(Scanner scanner, double min) {
        while (true){
            if(!scanner.hasNextDouble()){
                System.out.println("K p so, nhap lai");
                continue;
            }
            Double input = Double.parseDouble(scanner.nextLine());
            if(input <= min){
                System.out.println("Ko được nhỏ hơn "+ min);
                continue;
            }
            return input;
        }
    }
}