package ss8;

import java.util.Scanner;

public class B6 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int checkDigit(int num) {
        num = Math.abs(num);
        while (num >= 10) {
            num /= 10;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int n;
        int[] arr = null;
        while (true) {
            System.out.print("===== MENU CHÍNH =====\n" +
                    "1. Xử lý chuỗi\n" +
                    "2. Xử lý số nguyên\n" +
                    "3. Thoát chương trình\n" +
                    "Chọn chức năng (1-3): ");
            int choi = sc.nextInt();
            sc.nextLine();
            if (choi == 1) {
                while (true) {
                    System.out.print("===== MENU XỬ LÝ CHUỖI =====\n" +
                            "1. Nhập chuỗi\n" +
                            "2. Loại bỏ khoảng trắng thừa trong chuỗi\n" +
                            "3. Đếm số lần xuất hiện của từng ký tự\n" +
                            "4. Chuyển đổi chuỗi thành dạng chuẩn\n" +
                            "5. Quay lại menu chính\n" +
                            "Chọn chức năng (1-5): ");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.print("Nhập chuỗi: ");
                            str = sc.nextLine();
                            break;
                        case 2:
                            if (str.isEmpty()) {
                                System.out.println("Bạn cần nhập chuỗi trước!");
                                break;
                            }
                            str = str.trim().replaceAll("\\s+", " ");
                            System.out.println("Chuỗi sau khi loại bỏ khoảng trắng thừa: " + str);
                            break;
                        case 3:
                            if (str.isEmpty()) {
                                System.out.println("Bạn cần nhập chuỗi trước!");
                                break;
                            }
                            int[] freq = new int[256];
                            for (char c : str.toCharArray()) {
                                freq[c]++;
                            }
                            System.out.println("Số lần xuất hiện của từng ký tự:");
                            for (int i = 0; i < 256; i++) {
                                if (freq[i] > 0) {
                                    System.out.println((char) i + ": " + freq[i]);
                                }
                            }
                            break;
                        case 4:
                            if (str.isEmpty()) {
                                System.out.println("Bạn cần nhập chuỗi trước!");
                                break;
                            }
                            String[] words = str.toLowerCase().trim().split("\\s+");
                            StringBuilder formattedStr = new StringBuilder();
                            for (String word : words) {
                                formattedStr.append(Character.toUpperCase(word.charAt(0)))
                                        .append(word.substring(1)).append(" ");
                            }
                            str = formattedStr.toString().trim();
                            System.out.println("Chuỗi sau khi chuẩn hóa: " + str);
                            break;
                        case 5:
                            System.out.println("Quay lại menu chính...");
                            break;
                        default:
                            System.out.println("Vui lòng chọn đúng!");
                            continue;
                    }
                    if (choice == 5) break;
                }
            } else if (choi == 2) {
                while (true) {
                    System.out.print("===== MENU XỬ LÝ MẢNG SỐ NGUYÊN =====\n" +
                            "1. Nhập mảng số nguyên\n" +
                            "2. Tìm số nguyên tố lớn nhất trong mảng\n" +
                            "3. Đếm số phần tử có chữ số đầu tiên là số lẻ\n" +
                            "4. Kiểm tra mảng có phải là mảng đối xứng không\n" +
                            "5. Quay lại menu chính\n" +
                            "Chọn chức năng (1-5): ");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.print("Nhập n cho mảng: ");
                            n = sc.nextInt();
                            arr = new int[n];
                            for (int i = 0; i < n; i++) {
                                System.out.printf("Nhập arr[%d]: ", i);
                                arr[i] = sc.nextInt();
                            }
                            break;
                        case 2:
                            if (arr == null) {
                                System.out.println("Bạn cần nhập mảng trước!");
                                break;
                            }
                            int max = -1;
                            for (int num : arr) {
                                if (isPrime(num) && num > max) {
                                    max = num;
                                }
                            }
                            if (max == -1) {
                                System.out.println("Không có số nguyên tố trong mảng.");
                            } else {
                                System.out.println("Số nguyên tố lớn nhất trong mảng: " + max);
                            }
                            break;
                        case 3:
                            if (arr == null) {
                                System.out.println("Bạn cần nhập mảng trước!");
                                break;
                            }
                            int count = 0;
                            for (int num : arr) {
                                if (checkDigit(num) % 2 != 0) {
                                    count++;
                                }
                            }
                            System.out.println("Số phần tử có chữ số đầu tiên lẻ là: " + count);
                            break;
                        case 4:
                            if (arr == null) {
                                System.out.println("Bạn cần nhập mảng trước!");
                                break;
                            }
                            boolean isSymmetric = true;
                            for (int i = 0; i < arr.length / 2; i++) {
                                if (arr[i] != arr[arr.length - i - 1]) {
                                    isSymmetric = false;
                                    break;
                                }
                            }
                            System.out.println(isSymmetric ? "Là mảng đối xứng" : "Không phải là mảng đối xứng");
                            break;
                        case 5:
                            System.out.println("Quay lại menu chính...");
                            break;
                        default:
                            System.out.println("Vui lòng chọn đúng!");
                            continue;
                    }
                    if (choice2 == 5) break;
                }
            } else if (choi == 3) {
                System.out.println("Thoát chương trình...");
                sc.close();
                System.exit(0);
            } else {
                System.out.println("Vui lòng chọn đúng!");
            }
        }
    }
}