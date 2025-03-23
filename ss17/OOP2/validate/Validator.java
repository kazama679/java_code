package ss17.OOP2.validate;

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
}
