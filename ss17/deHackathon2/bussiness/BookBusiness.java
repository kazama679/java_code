package ss17.deHackathon2.bussiness;

import ss17.deHackathon2.entity.Book;
import ss17.deHackathon2.presentation.BookApplication;
import ss17.deHackathon2.validate.BookIdValidate;
import ss17.deHackathon2.validate.Validator;

import java.util.Scanner;

public class BookBusiness {
    public static void printArrBook() {
        if(BookApplication.currentIndex==0) {
            System.out.println("Danh sách rỗng");
            return;
        }
        for(int i=0; i<BookApplication.currentIndex; i++) {
            BookApplication.books[i].displayData();
        }
    }

    public static void addBook(Scanner sc) {
        if(BookApplication.currentIndex>=BookApplication.books.length) {
            System.out.println("Mảng đã đầy k thể thêm");
            return;
        }
        System.out.println("Nhập vào số lượng sách muốn xem: ");
        int n = Integer.parseInt(sc.nextLine());
        while (true){
            if(n+BookApplication.currentIndex<=BookApplication.books.length) {
                break;
            }
            System.out.println("Số lượng thêm vượt quá!");
            n=Integer.parseInt(sc.nextLine());
        }
        for (int i=0; i<n; i++) {
            BookApplication.books[BookApplication.currentIndex] = new Book();
            BookApplication.books[BookApplication.currentIndex].inputData(sc);
            BookApplication.currentIndex++;
        }
        System.out.println("Thêm thành công");
    }

    public static int findIndex(String id) {
        for(int i = 0; i < BookApplication.currentIndex; i++){
            if(BookApplication.books[i].getBookId().equals(id.trim())) {
                return i;
            }
        }
        return -1;
    }
    public static void deleteBook(Scanner sc) {
        System.out.println("Nhập vào id sách muốn xóa: ");
        String id = sc.nextLine();
        int index = findIndex(id);
        if(index == -1){
            System.out.println("k tim thay id danh muc muon sua");
            return;
        }
        System.out.println("Bạn có chắc chắn muốn xóa sách k: ");
        System.out.println("1. Có");
        System.out.println("2. Không");
        int choice = Integer.parseInt(sc.nextLine());
        if(choice == 1) {
            for(int i=index; i<BookApplication.currentIndex; i++) {
                BookApplication.books[i] = BookApplication.books[i+1];
            }
            BookApplication.currentIndex--;
            System.out.println("Xóa thành công");
        }
    }

    public static void updateBook(Scanner sc) {
        System.out.println("Nhập vào id sách muốn sửa: ");
        String id = sc.nextLine();
        int index = findIndex(id);
        if(index == -1){
            System.out.println("k tìm thấy");
        }else{
            System.out.println("Nhập vào tiêu đề sách: ");
            BookApplication.books[index].setBookTitle(Validator.validateString(sc, 1, 100));
            System.out.println("Nhập vào tác giả sách: ");
            BookApplication.books[index].setAuthor(Validator.validateString(sc, 1, 50));
            System.out.println("Nhập vào nhà xuất bản sách: ");
            BookApplication.books[index].setPublisher(Validator.validateString(sc, 1, 100));
            System.out.println("Nhập vào năm sản xuất: ");
            BookApplication.books[index].setPublicationYear(Validator.validateInt(sc, 1960));
            System.out.println("Nhập vào danh mục sách: ");
            BookApplication.books[index].setCategory(Validator.validateString(sc, 1, 100));
            System.out.println("Nhập vào giá bán sách: ");
            BookApplication.books[index].setPrice(Validator.validateDouble(sc, 0));
            System.out.println("Nhập vào số lượng sách: ");
            BookApplication.books[index].setQuantity(Validator.validateInt(sc, 1));
        }
    }

    public static void searchBook(Scanner sc) {
        int choice;
        do {
            System.out.println("-----MENU-------");
            System.out.println("1. Tìm kiếm theo tiêu đề sách");
            System.out.println("2. Tìm kiếm theo thể loại sách");
            System.out.println("3. Tìm kiếm theo khoảng giá sách");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập tiêu đề sách: ");
                    String ti = sc.nextLine();
                    boolean check=false;
                    for (int i=0; i<BookApplication.currentIndex; i++) {
                        if(BookApplication.books[i].getBookTitle().toLowerCase().contains(ti.trim().toLowerCase())) {
                            BookApplication.books[i].displayData();
                            check=true;
                        }
                    }
                    if(!check) {
                        System.out.println("K tìm thấy");
                    }
                    break;
                case 2:
                    System.out.println("nhập thể loại sách: ");
                    String cate = sc.nextLine();
                    boolean check2=false;
                    for (int i=0; i<BookApplication.currentIndex; i++) {
                        if(BookApplication.books[i].getCategory().toLowerCase().contains(cate.trim().toLowerCase())) {
                            BookApplication.books[i].displayData();
                            check2=true;
                        }
                    }
                    if(!check2) {
                        System.out.println("K tìm thấy");
                    }
                    break;
                case 3:
                    System.out.println("Nhập giá bắt đầu tìm: ");
                    int startPrice = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập giá bắt đầu tìm: ");
                    int endPrice = Integer.parseInt(sc.nextLine());
                    boolean check3=false;
                    for (int i=0; i<BookApplication.currentIndex; i++) {
                        if(BookApplication.books[i].getPrice() >= startPrice && BookApplication.books[i].getPrice() <= endPrice) {
                            BookApplication.books[i].displayData();
                            check3=true;
                        }
                    }
                    if(!check3) {
                        System.out.println("k tìm thấy");
                    }
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Chọn từ 1-4");
                    break;
            }
        } while (choice!=4);
    }

    public static void orderBook(Scanner sc) {
        int choice;
        do {
            System.out.println("-----MENU-------");
            System.out.println("1. Sắp xếp theo tiêu đề tăng dần");
            System.out.println("2. Sắp xếp theo tiêu đề giảm dần");
            System.out.println("3. Sắp xếp theo giá tăng dần");
            System.out.println("4. Sắp xếp theo giá giảm dần");
            System.out.println("5. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < BookApplication.currentIndex; i++) {
                        for (int j = i + 1; j < BookApplication.currentIndex; j++) {
                            if (BookApplication.books[i].getBookTitle().compareToIgnoreCase(BookApplication.books[j].getBookTitle()) > 0) {
                                Book temp = BookApplication.books[i];
                                BookApplication.books[i] = BookApplication.books[j];
                                BookApplication.books[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp sách theo tiêu đề (A-Z).");
                    break;
                case 2:
                    for (int i = 0; i < BookApplication.currentIndex; i++) {
                        for (int j = i + 1; j < BookApplication.currentIndex; j++) {
                            if (BookApplication.books[i].getBookTitle().compareToIgnoreCase(BookApplication.books[j].getBookTitle()) < 0) {
                                Book temp = BookApplication.books[i];
                                BookApplication.books[i] = BookApplication.books[j];
                                BookApplication.books[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp sách theo tiêu đề (Z-A).");
                    break;
                case 3:
                    for(int i=0; i<BookApplication.currentIndex; i++) {
                        for(int j=i+1; j<BookApplication.currentIndex; j++) {
                            if(BookApplication.books[i].getPrice() > BookApplication.books[j].getPrice()) {
                                Book temp = BookApplication.books[i];
                                BookApplication.books[i] = BookApplication.books[j];
                                BookApplication.books[j] = temp;
                            }
                        }
                    }
                    break;
                case 4:
                    for(int i=0; i<BookApplication.currentIndex; i++) {
                        for(int j=i+1; j<BookApplication.currentIndex; j++) {
                            if(BookApplication.books[i].getPrice() < BookApplication.books[j].getPrice()) {
                                Book temp = BookApplication.books[i];
                                BookApplication.books[i] = BookApplication.books[j];
                                BookApplication.books[j] = temp;
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Chọn từ 1-5");
                    break;
            }
        } while (choice!=5);
    }
}