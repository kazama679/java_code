package ss17.deHackathon2.presentation;

import ss17.deHackathon2.bussiness.BookBusiness;
import ss17.deHackathon2.entity.Book;

import java.util.Scanner;

public class BookApplication {
    public static final Book[] books = new Book[100];
    public static int currentIndex=0;

    public static void main(String[] args) {
        // tạo sẵn cho dễ check
        books[0] = new Book("tác giả1", "B00001", "Tiêu đề 1", "Danh mục 1", 10000, 2001, "NSX", 12);
        books[1] = new Book("tác giả", "B00002", "Tiêu đề 2", "Danh mục ", 15000, 2001, "NSX", 15);
        books[2] = new Book("tác giả3", "B00003", "Tiêu đề 3", "Danh mục 3", 12000, 2001, "NSX", 22);
        currentIndex+=3;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("----------------------------Book Menu----------------------------\n" +
                    "1. Hiển thị danh sách các cuốn sách\n" +
                    "2. Thêm mới sách\n" +
                    "3. Chỉnh sửa thông tin sách\n" +
                    "4. Xóa sách\n" +
                    "5. Tìm kiếm sách\n" +
                    "6. Sắp xếp\n" +
                    "0. Thoát chương trình\n"+
                    "Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice) {
                case 1:
                    BookBusiness.printArrBook();
                    break;
                case 2:
                    BookBusiness.addBook(sc);
                    break;
                case 3:
                    BookBusiness.updateBook(sc);
                    break;
                case 4:
                    BookBusiness.deleteBook(sc);
                    break;
                case 5:
                    BookBusiness.searchBook(sc);
                    break;
                case 6:
                    BookBusiness.orderBook(sc);
                    break;
                case 0:
                    System.out.println("Thoát!");
                    System.exit(0);
                default:
                    System.out.println("Nhập từ 0-6");
                    break;
            }
        }
    }
}