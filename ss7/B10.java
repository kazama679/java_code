package ss7;

import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Bài tập 10");
        while(true){
            System.out.println("===== MENU QUẢN LÝ CHUỖI =====\n" +
                    "1. Đảo ngược chuỗi\n" +
                    "2. Chèn chuỗi vào vị trí bất kỳ\n" +
                    "3. Xóa một đoạn trong chuỗi\n" +
                    "4. Thay thế một đoạn trong chuỗi\n" +
                    "5. Chuyển đổi toàn bộ chuỗi thành chữ hoa/chữ thường\n" +
                    "6. Thoát chương trình\n" +
                    "Chọn chức năng (1-6):\n");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    sb.reverse();
                    System.out.println(sb);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("nhập chuỗi bất kì: ");
                    String s = sc.nextLine();
                    System.out.println("nhập vị trí truyền: ");
                    int x = sc.nextInt();
                    sb.insert(x, s);
                    System.out.println("Kết quả khi chèn: "+ sb);
                    break;
                case 3:
                    System.out.println("nhập vị trí bắt đầu xóa: ");
                    int a = sc.nextInt();
                    System.out.println("nhập vị trí kết thúc xóa: ");
                    int b = sc.nextInt();
                    sb.delete(a, b);
                    System.out.println("Kết quả khi xóa: "+ sb);
                    break;
                case 4:
                    System.out.println("nhập vị trí bắt đầu thay thế: ");
                    int a2 = sc.nextInt();
                    System.out.println("nhập vị trí kết thúc thay thế: ");
                    int b2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("nhập chuỗi bất kì để thay thế: ");
                    String s2 = sc.nextLine();
                    sb.replace(a2, b2, s2);
                    System.out.println("Kết quả khi xóa: "+ sb);
                    break;
                case 5:
                    System.out.println("Chọn 1 để chuyển thành chữ hoa, chọn 2 để chuyển thành chữ thường: ");
                    int a3 = sc.nextInt();
                    sc.nextLine();
                    if (a3 == 1) {
                        sb = new StringBuilder(sb.toString().toUpperCase());
                    } else if (a3 == 2) {
                        sb = new StringBuilder(sb.toString().toLowerCase());
                    } else {
                        System.out.println("Nhập lại cho đúng");
                    }
                    System.out.println(sb);
                    break;
                case 6:
                    System.out.println("thoát");
                    System.exit(0);
                default:
                    System.out.println("vui lòng nhập đúng");
            }
        }
    }
}