package ss17.OOP2.imp;

import ss17.OOP2.entity.Product;
import ss17.OOP2.validate.Validator;

import java.util.Scanner;

public class ProductImp {
    public static Product[] products = new Product[100];
    public static int currentIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        products[currentIndex++] = new Product("mô tả1", 120000, 100000, "P001", "Sản phẩm1", 17, true);
        products[currentIndex++] = new Product("mô tả2", 190000, 100000, "P002", "Sản phẩm2", 5, true);
        products[currentIndex++] = new Product("mô tả3", 130000, 100000, "P003", "Sản phẩm3", 21, false);

        while(true) {
            System.out.print("----------------------------MENU----------------------------\n" +
                    "1. Nhập thông tin n sản phẩm (n nhập từ bàn phím)\n" +
                    "2. Hiển thị thông tin các sản phẩm\n" +
                    "3. Tính lợi nhuận các sản phẩm\n" +
                    "4. Sắp xếp các sản phẩm theo lợi nhuận giảm dần\n" +
                    "5. Thống kê các sản phẩm theo giá\n" +
                    "6. Tìm các sản phẩm theo tên sản phẩm\n" +
                    "7. Nhập sản phẩm\n" +
                    "8. Bán sản phẩm\n" +
                    "9. Cập nhật trạng thái sản phẩm\n" +
                    "10. Thoát\n" +
                    "Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    printInterest();
                    break;
                case 4:
                    orderByInterest();
                    break;
                case 5:
                    printBookOfPrice(scanner);
                    break;
                case 6:
                    searchName(scanner);
                    break;
                case 7:
                    addQuantity(scanner);
                    break;
                case 8:
                    exportProduct(scanner);
                    break;
                case 9:
                    updateStatus(scanner);
                    break;
                case 10:
                    System.out.println("Thoát!");
                    System.exit(0);
                default:
                    System.out.println("Nhập từ 1-10");
                    break;
            }
        }
    }

    public static void addBook(Scanner scanner) {
        System.out.println("Nhập vào n sản phẩm muốn thêm: ");
        int n = Validator.validateInt(scanner, 1);
        if(n+currentIndex>products.length) {
            System.out.println("K thể thêm vì mảng đã đầy");
            return;
        }
        for (int i = 0; i < n; i++) {
            products[currentIndex] = new Product();
            products[currentIndex].inputData(scanner, products);
            currentIndex++;
        }
    };
    public static void displayBooks() {
        if(currentIndex==0) {
            System.out.println("danh sách rỗng");
            return;
        }
        for (int i = 0; i < currentIndex; i++) {
            products[i].displayData();
        }
    };
    public static void printInterest() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("Sản phẩm "+products[i].getProductName()+" có doanh thu là: "+products[i].getProfit());
        }
    };
    public static void orderByInterest() {
        for (int i = 0; i < currentIndex; i++) {
            for (int j = i + 1; j < currentIndex; j++) {
                if(products[i].getProfit() < products[j].getProfit()) {
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }
        displayBooks();
    };

    public static void printBookOfPrice(Scanner scanner) {
        System.out.println("Nhập số tiền bắt đầu tìm: ");
        int startNumber = Validator.validateInt(scanner, 0);
        System.out.println("Nhập số tiền kết thúc tìm: ");
        int endNumber = Validator.validateInt(scanner, startNumber);
        boolean flag = false;
        for (int i = 0; i <= currentIndex; i++) {
            if(products[i] != null && products[i].getExportPrice() >= startNumber && products[i].getExportPrice() <= endNumber) {
                flag = true;
                products[i].displayData();
            }
        }
        if(!flag) {
            System.out.println("K tìm thấy giá muốn tìm");
        }
    };

    public static void searchName(Scanner scanner) {
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String name = Validator.validateString(scanner, 1, 10000);
        boolean flag = false;
        for (int i = 0; i < currentIndex; i++) {
            if(products[i] != null && products[i].getProductName().toLowerCase().contains(name.toLowerCase().trim())) {
                flag = true;
                products[i].displayData();
            }
        }
        if(!flag) {
            System.out.println("K tìm thấy tên muốn tìm");
        }
    }

    public static void addQuantity(Scanner scanner) {
        System.out.println("nhập id sản phẩm: ");
        String id = scanner.nextLine();
        int flag = -1;
        for (int i = 0; i < currentIndex; i++) {
            if(products[i].getProductid().equals(id)) {
                flag = i;
                break;
            }
        }
        if(flag== -1) {
            System.out.println("k tìm thấy id sản phẩm");
            return;
        }
        System.out.println("nhập số lượng muốn thêm: ");
        int quantity = Validator.validateInt(scanner, 1);
        products[flag].setQuantity(quantity+products[flag].getQuantity());
        products[flag].displayData();
    }

    public static int FindIndex(String id) {
        for (int i = 0; i < currentIndex; i++) {
            if(products[i].getProductid().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static void exportProduct(Scanner scanner) {
        System.out.println("nhập vào id sản phẩm muốn bán: ");
        String id = scanner.nextLine();
        int index = FindIndex(id);
        if(index == -1) {
            System.out.println("k tìm thấy");
            return;
        }
        System.out.println("nhập số lượng muốn bán: ");
        int quantity = Validator.validateInt(scanner, 1);
        if(products[index].getQuantity()<quantity){
            System.out.println("Số lượng trong kho k đủ");
            return;
        }
        products[index].setQuantity(products[index].getQuantity()-quantity);
        products[index].displayData();
    };

    public static void updateStatus(Scanner scanner) {
        System.out.println("nhập vào id sản phẩm muốn đổi trạng thái: ");
        String id = scanner.nextLine();
        int index = FindIndex(id);
        if(index == -1) {
            System.out.println("k tìm thấy");
            return;
        }
        products[index].setStatus(!products[index].isStatus());
        products[index].displayData();
    }
}
