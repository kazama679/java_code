package ss17.OOP1.validate;

import ss17.OOP1.run.Main;

import java.util.Scanner;

public class Validator {
    public static String validateString(Scanner scanner, int min, int max) {
        while (true) {
            String input = scanner.nextLine();
            if (input.length() >= min && input.length() <= max) {
                return input;
            }
            System.out.println("Dữ liệu nhập không hợp lệ, nhập lại");
        }
    }

    public static int validateInt(Scanner scanner, int min) {
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Không phải số, nhập lại:");
                scanner.next();
                continue;
            }
            int n = scanner.nextInt();
            scanner.nextLine();
            if (n < min) {
                System.out.println("Không được nhỏ hơn " + min);
                continue;
            }
            return n;
        }
    }

    public static float validateFloat(Scanner scanner, float min) {
        while (true) {
            if (!scanner.hasNextFloat()) {
                System.out.println("Không phải số, nhập lại:");
                scanner.next();
                continue;
            }
            float n = scanner.nextFloat();
            scanner.nextLine();
            if (n <= min) {
                System.out.println("Không được nhỏ hơn " + min);
                continue;
            }
            return n;
        }
    }

    public static String validateId(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            if(!input.matches("B\\w{3}$")){
                System.out.println("K hợp lệ, nhập lại");
                continue;
            }
            boolean check = false;
            for (int i = 0; i< Main.books.size(); i++){
                if(Main.books.get(i).getBookId().equals(input)){
                    check = true;
                    break;
                }
            }
            if(!check){
                return input;
            }
            System.out.println("Id đã trùng, nhập lại");
        }
    }

    public static String checkSomeName(Scanner scanner, String input) {
        while(true){
            boolean check = false;
            for (int i = 0; i< Main.books.size(); i++){
                if(Main.books.get(i).getBookName().trim().equals(input.trim())){
                    check = true;
                    break;
                }
            }
            if(!check){
                return input;
            }
            System.out.println("Tên đã trùng, nhập lại");
            input = scanner.nextLine();
        }
    }
}
