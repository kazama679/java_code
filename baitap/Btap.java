package ss9.baitap;

import java.time.LocalDate;
import java.util.Scanner;

public class Btap {
    static Book[] arrBook = new Book[100];
    static int countBook = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("\n1. Danh sách sách\n" +
                    "2. Thêm mới sách\n" +
                    "3. Tính lợi nhuận của các sách\n" +
                    "4. Cập nhật sách\n" +
                    "5. Xóa sách\n" +
                    "6. Sắp xếp sách theo lợi nhuận tăng dần\n" +
                    "7. Tìm kiếm sách theo tác giả\n" +
                    "8. Tìm kiếm sách theo khoảng giá (tìm theo khoảng giá bán)\n" +
                    "9. Thống kê sách theo mỗi tác giả\n" +
                    "10.Thoát\n" +
                    "Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    printBooks();
                    break;
                case 2:
                    addBook(sc);
                    break;
                case 3:
                    profit(sc);
                    break;
                case 4:
                    updateBook(sc);
                    break;
                case 5:
                    deleteBook(sc);
                    break;
                case 6:
                    printOrder();
                    printBooks();
                    break;
                case 7:
                    searchName(sc);
                    break;
                case 8:
                    searchPrice(sc);
                    break;
                case 9:
                    bookOfAuthor();
                    break;
                case 10:
                    System.out.println("Thoát!");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1 - 10: ");
                    break;
            }
        }
    }

    public static void printBooks() {
        if(countBook == 0){
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.println("\nDanh sách sách: ");
        for (int i = 0; i < countBook; i++) {
            arrBook[i].displayData();
        }
    }

    public static void addBook(Scanner sc) {
        arrBook[countBook] = new Book();
        arrBook[countBook].inputData(sc);
        countBook++;
    }

    public static void profit(Scanner sc) {
        System.out.println("Lợi nhuận các sách: ");
        for (int i = 0; i < countBook; i++) {
            System.out.println(arrBook[i].getBookName() + " có lợi nhuận: "+ arrBook[i].calInterest());
        }
    }

    public static int findId(String id) {
        for (int i = 0; i < countBook; i++) {
            if (arrBook[i].getBookId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    // cập nhâp
    public static void updateBook(Scanner sc) {
        System.out.println("Nhập id sách cần cập nhập: ");
        String id = sc.nextLine();
        int index = findId(id);
        if (index == -1) {
            System.out.println("K tìm thấy mã sách");
        }else{
            boolean isExit = true;
            do{
                System.out.println("1. Cập nhật tên sách");
                System.out.println("2. Cập nhật giá nhập sách");
                System.out.println("3. Cập nhật giá bán sách");
                System.out.println("4. Cập nhật tiêu đề sách");
                System.out.println("5. Cập nhật tác giả của sách");
                System.out.println("6. Cập nhật năm sản xuất sách");
                System.out.println("7. Thoát");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Nhập vào tên sách mới:");
                        while (true) {
                            String newName = sc.nextLine();
                            if (newName.length() >= 6 && newName.length() <= 100) {
                                arrBook[index].setBookName(newName);
                                break;
                            } else {
                                System.err.println("Tên sách phải có từ 6 - 100 kí tự.");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhập vào giá nhập sách mới:");
                        while (true) {
                            try {
                                double newImportPrice = Double.parseDouble(sc.nextLine());
                                if (newImportPrice > 0) {
                                    arrBook[index].setImportPrice(newImportPrice);
                                    break;
                                } else {
                                    System.err.println("Giá nhập sách phải lớn hơn 0.");
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("Vui lòng nhập một số hợp lệ.");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhập vào giá bán sách mới:");
                        while (true) {
                            try {
                                double newExportPrice = Double.parseDouble(sc.nextLine());
                                if (newExportPrice >= arrBook[index].getImportPrice() * 1.1) {
                                    arrBook[index].setExportPrice(newExportPrice);
                                    break;
                                } else {
                                    System.err.println("Giá bán phải lớn hơn giá nhập ít nhất 10%.");
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("Vui lòng nhập một số hợp lệ.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Nhập vào tiêu đề sách mới:");
                        while (true) {
                            String newTitle = sc.nextLine();
                            if (!newTitle.isEmpty()) {
                                arrBook[index].setTitle(newTitle);
                                break;
                            } else {
                                System.err.println("Tiêu đề không được để trống.");
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Nhập vào tác giả mới:");
                        while (true) {
                            String newAuthor = sc.nextLine();
                            if (!newAuthor.isEmpty()) {
                                arrBook[index].setAuthor(newAuthor);
                                break;
                            } else {
                                System.err.println("Tác giả không được để trống.");
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Nhập vào năm sản xuất sách mới:");
                        int currentYear = LocalDate.now().getYear();
                        while (true) {
                            try {
                                int newYear = Integer.parseInt(sc.nextLine());
                                if (newYear > 1970 && newYear <= currentYear) {
                                    arrBook[index].setYear(newYear);
                                    break;
                                } else {
                                    System.err.println("Vui lòng nhập năm sau 1970 và nhỏ hơn hoặc bằng " + currentYear + ".");
                                }
                            } catch (NumberFormatException e) {
                                System.err.println("Vui lòng nhập một số nguyên hợp lệ.");
                            }
                        }
                        break;
                    case 7:
                        isExit = false;
                    default:
                        System.out.println("Nhập từ 1-6");
                        break;
                }
            }while(isExit);
        }
    }
    // end cập nhập

    public static void deleteBook(Scanner sc) {
        System.out.println("Nhập vào mã sách cần xóa");
        String id = sc.nextLine();
        int indexDelete = findId(id);
        if (indexDelete == -1) {
            System.err.println("Không tồn tại sách có mã " + id);
        } else {
            //Thực hiện xóa
            for (int i = indexDelete; i < countBook; i++) {
                arrBook[i] = arrBook[i + 1];
            }
            countBook--;
        }
    }

    public static void printOrder() {
        if(countBook == 0){
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (int i = 0; i < countBook - 1; i++) {
            for (int j = 0; j < countBook - i - 1; j++) {
                if (arrBook[j].calInterest() > arrBook[j + 1].calInterest()) {
                    Book temp = arrBook[j];
                    arrBook[j] = arrBook[j + 1];
                    arrBook[j + 1] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp");
    }

    public static void searchName(Scanner sc) {
        System.out.println("Nhập tên tác giả: ");
        String name = sc.nextLine();
        int check=0;
        for (int i = 0; i < countBook; i++) {
            if(arrBook[i].getAuthor().equals(name)){
                arrBook[i].displayData();
                check++;
            }
        }
        if(check==0){
            System.out.println("k tìm thấy");
        }
    }

    public static void searchPrice(Scanner sc) {
        System.out.println("Nhập vào số tiền bắt đầu: ");
        double price1 = sc.nextDouble();
        System.out.println("Nhập vào số tiền kết thúc tìm: ");
        double price2 = sc.nextDouble();
        int check=0;
        for (int i = 0; i < countBook; i++) {
            if(arrBook[i].getExportPrice() >= price1 && arrBook[i].getExportPrice() <= price2){
                arrBook[i].displayData();
                check++;
            }
        }
        if(check==0){
            System.out.println("k tìm thấy");
        }
    }

    public static void bookOfAuthor() {
        String[] arrAuthor = new String[100];
        int authorCount = 0;
        for (int i = 0; i < countBook; i++) {
            String author = arrBook[i].getAuthor();
            boolean exists = false;
            for (int j = 0; j < authorCount; j++) {
                if (arrAuthor[j].equals(author)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                arrAuthor[authorCount] = author;
                authorCount++;
            }
        }
        for (int i = 0; i < authorCount; i++) {
            System.out.printf("Các sách của tác giả %s là: \n", arrAuthor[i]);
            for (int j = 0; j < countBook; j++) {
                if (arrBook[j].getAuthor().equals(arrAuthor[i])) {
                    arrBook[j].displayData();
                }
            }
        }
    }
}