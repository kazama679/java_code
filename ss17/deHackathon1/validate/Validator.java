package ss17.deHackathon1.validate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+-]+@gmail.com$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^(0[3-9])+([0-9]{8})$");
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String validateString(Scanner scanner, int min, int max) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (!input.isEmpty() && input.length() >= min && input.length() <= max) {
                return input;
            }
            System.out.println("Dữ liệu không hợp lệ, nhập lại!");
        }
    }

    public static String validatePhone(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (PHONE_PATTERN.matcher(input).matches()) {
                return input;
            }
            System.out.println("Số điện thoại không hợp lệ, nhập lại!");
        }
    }

    public static String validateEmail(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (EMAIL_PATTERN.matcher(input).matches()) {
                return input;
            }
            System.out.println("Email không hợp lệ, nhập lại!");
        }
    }

    public static String validateDate(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                LocalDate date = LocalDate.parse(input, DATE_FORMATTER);
                LocalDate now = LocalDate.now();
                if (date.isBefore(now)) {
                    return input;
                } else {
                    System.out.println("Ngày sinh không hợp lệ (phải trước ngày hiện tại), nhập lại!");
                }
            } catch (DateTimeParseException e) {
                System.out.println("Ngày sinh không hợp lệ (dd/MM/yyyy), nhập lại!");
            }
        }
    }

    public static float validateFloat(Scanner scanner, float min) {
        while (true) {
            if (!scanner.hasNextFloat()) {
                System.out.println("Dữ liệu không hợp lệ, nhập lại!");
                scanner.next();
                continue;
            }
            float value = scanner.nextFloat();
            scanner.nextLine();
            if (value >= min) {
                return value;
            }
            System.out.println("Giá trị không hợp lệ, nhập lại!");
        }
    }
}
