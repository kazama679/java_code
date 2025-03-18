package ss13.baitap;

import java.util.Scanner;

public class Main {
    static Categories[] categories = new Categories[100];
    static int categoriesIndex = 0;
    static Product[] products = new Product[100];
    static int productIndex = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // thêm sẵn cho dễ check
        categories[0] = new Categories("Laptop", 1, "Mô tả 1", true);
        categories[1] = new Categories("Điện thoại", 2, "Mô tả 2", false);
        categories[2] = new Categories("Túi sách", 1, "Mô tả 3", true);
        categoriesIndex+=3;
        products[0] = new Product("Mô tả sản phẩm 1", 120000, 1, 100000, "2", "Laptop gaming", 12, 0, "Tiêu đề sp1");
        products[1] = new Product("Mô tả sản phẩm 2", 150000, 2, 100000, "C0002", "Điện thoại X", 13, 1, "Tiêu đề sp2");
        products[2] = new Product("Mô tả sản phẩm ", 2000000, 1, 100000, "C0003", "Laptop văn phòng", 14, 2, "Tiêu đề sp3");
        productIndex+=3;

        while(true){
            System.out.print("*********************SHOP MENU*********************\n" +
                    "1. Quản lý danh mục\n" +
                    "2. Quản lý sản phẩm\n" +
                    "3. Thoát\n" +
                    "Lựa chọn của bạn: ");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1){
                case 1:
                    int choice2;
                    do{
                        System.out.print("********************CATEGORIE MANAGEMENT*********************\n" +
                                "1. Danh sách danh mục\n" +
                                "2. Thêm mới danh mục\n" +
                                "3. Cập nhật danh mục\n" +
                                "4. Xóa danh mục\n" +
                                "5. Tìm kiếm danh mục theo tên\n" +
                                "6. Thoát\n" +
                                "Lựa chọn của bạn: ");
                        choice2 = Integer.parseInt(scanner.nextLine());
                        switch (choice2){
                            case 1:
                                if(categoriesIndex==0){
                                    System.out.println("danh sách rỗng!");
                                }else{
                                    for(int i = 0; i < categoriesIndex; i++){
                                        categories[i].displayData();
                                    }
                                }
                                break;
                            case 2:
                                if (categoriesIndex < categories.length) {
                                    categories[categoriesIndex] = new Categories();
                                    categories[categoriesIndex].inputData(scanner);
                                    categoriesIndex++;
                                } else {
                                    System.out.println("Danh sách danh mục đã đầy!");
                                }
                                break;
                            case 3:
                                updateCategory(scanner);
                                break;
                            case 4:
                                deleteCate(scanner);
                                break;
                            case 5:
                                searchName(scanner);
                                break;
                            case 6:
                                System.out.println("Thoát menu category");
                                break;
                            default:
                                System.out.println("Vui lòng chọn từ 1-6!");
                        }
                    }while (choice2!=6);
                    break;
                case 2:
                    int choice3;
                    do{
                        System.out.print("************************PRODUCT MANAGEMENT*******************\n" +
                                "1. Danh sách sản phẩm\n" +
                                "2. Thêm mới sản phẩm\n" +
                                "3. Cập nhật sản phẩm\n" +
                                "4. Xóa sản phẩm\n" +
                                "5. Tìm kiếm sản phẩm theo tên hoặc tiêu đề\n" +
                                "6. Tìm kiếm sản phẩm theo khoảng giá bán\n" +
                                "7. Sắp xếp sản phẩm theo giá bán tăng dần\n" +
                                "8. Bán sản phẩm\n" +
                                "9. Thống kê số lượng sản phẩm theo danh mục\n" +
                                "10. Thoát\n" +
                                "Lựa chọn của bạn: ");
                        choice3 = Integer.parseInt(scanner.nextLine());
                        switch (choice3){
                            case 1:
                                if(productIndex==0){
                                    System.out.println("Danh sách rỗng!");
                                }else{
                                    for(int i = 0; i <productIndex; i++){
                                        products[i].displayData();
                                    }
                                }
                                break;
                            case 2:
                                if (productIndex < products.length) {
                                    products[productIndex] = new Product();
                                    products[productIndex].inputData(scanner);
                                    productIndex++;
                                } else {
                                    System.out.println("Danh sách sản phẩm đã đầy!");
                                }
                                break;
                            case 3:
                                updateProduct(scanner);
                                break;
                            case 4:
                                deletePro(scanner);
                                break;
                            case 5:
                                searchNameOrTitle(scanner);
                                break;
                            case 6:
                                searchPrice(scanner);
                                break;
                            case 7:
                                orderPrice();
                                break;
                            case 8:
                                exportProduct(scanner);
                                break;
                            case 9:
                                printProductByCate();
                                break;
                            case 10:
                                System.out.println("Thoát menu product");
                                continue;
                            default:
                                System.out.println("Vui lòng chọn từ 1-10!");
                        }
                    }while (choice3!=10);
                    break;
                case 3:
                    System.out.println("thoát");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1-3!");
            }
        }
    }

    public static int findIndex(int id) {
        for (int i = 0; i < categoriesIndex; i++) {
            if(categories[i].getCateId() == id){
                return i;
            }
        }
        return -1;
    }
    public static void updateCategory(Scanner scanner) {
        System.out.println("Nhập vào id danh mục cần cập nhập: ");
        int id = Integer.parseInt(scanner.nextLine());
        int indexUpdate = findIndex(id);
        if(indexUpdate!=-1){
            System.out.println("K tìm thấy id danh mục");
        }else{
            boolean isExit = true;
            do {
                System.out.println("1. cập nhập tên danh mục");
                System.out.println("2. cập nhập số ưu tiên danh mục");
                System.out.println("3. cập nhập mô tả danh mục");
                System.out.println("4. cập nhập trạng thái danh mục");
                System.out.println("5. thoát");
                System.out.println("Lựa chọn của bạn: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("nhập vào tên cập nhập");
                        String cateName;
                        while(true){
                            cateName = scanner.nextLine();
                            if(cateName.length()<6 || cateName.length()>50){
                                System.out.println("tên danh mục từ 6-50 kí tự!");
                            }else{
                                break;
                            }
                        }
                        categories[indexUpdate].setCateName(cateName);
                        break;
                    case 2:
                        System.out.println("nhập vào số ưu tiên cập nhập");
                        categories[indexUpdate].setCateUp(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 3:
                        System.out.println("nhập vào mô tả cập nhập");
                        categories[indexUpdate].setDescription(scanner.nextLine());
                        break;
                    case 4:
                        System.out.println("nhập vào trạng thái(true-false) cập nhập");
                        categories[indexUpdate].setStatus(Boolean.parseBoolean(scanner.nextLine()));
                        break;
                    case 5:
                        isExit = false;
                        break;
                    default:
                        System.out.println("Nhập 1-5");
                }
            }while (isExit);
        }
    }

    public static void deleteCate(Scanner scanner) {
        System.out.println("Nhập vào id danh mục cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int indexDelete = findIndex(id);
        if(indexDelete!=-1){
            System.out.println("K tìm thấy id danh mục");
        }else{
            boolean checkPro = false;
            for (int i = 0; i < productIndex; i++) {
                if(products[i].getIdCategorys() == id){
                    checkPro = true;
                }
            }
            if(checkPro){
                System.out.println("K thể xóa danh mục này vì còn sản phẩm!");
            }else{
                for (int i=indexDelete;i<categoriesIndex;i++){
                    categories[i]=categories[i+1];
                }
                categoriesIndex--;
            }
        }
    }

    public static void searchName(Scanner scanner) {
        System.out.println("nhập vào tên danh mục cần tìm kiếm: ");
        String cateNameSearch = scanner.nextLine();
        boolean check=false;
        for (int i = 0; i < categoriesIndex; i++) {
            if (categories[i].getCateName().equals(cateNameSearch)) {
                categories[i].displayData();
                check=true;
            }
        }
        if(!check){
            System.out.println("k tìm thấy");
        }
    }

    // phần bên product
    public static int findProductIndex(String id) {
        for (int i = 0; i < productIndex; i++) {
            if (products[i].getProId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static void updateProduct(Scanner scanner) {
        System.out.println("Nhập vào ID sản phẩm cần cập nhật: ");
        String id = scanner.nextLine();
        int indexUpdate = findProductIndex(id);
        if (indexUpdate == -1) {
            System.out.println("Không tìm thấy sản phẩm với ID này.");
        } else {
            boolean isExit = true;
            do {
                System.out.println("1. Cập nhật tên sản phẩm");
                System.out.println("2. Cập nhật giá nhập");
                System.out.println("3. Cập nhật giá bán");
                System.out.println("4. Cập nhật tiêu đề");
                System.out.println("5. Cập nhật số lượng");
                System.out.println("6. Cập nhật trạng thái");
                System.out.println("7. Cập nhật id danh mục thuộc về");
                System.out.println("8. Thoát");
                System.out.println("Lựa chọn của bạn: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Nhập vào tên sản phẩm mới:");
                        String newName;
                        while (true) {
                            newName = scanner.nextLine();
                            if (newName.length() >= 10 && newName.length() <= 100) {
                                break;
                            } else {
                                System.out.println("Tên sản phẩm phải từ 10-100 ký tự!");
                            }
                        }
                        products[indexUpdate].setProName(newName);
                        break;
                    case 2:
                        System.out.println("Nhập vào giá nhập mới:");
                        float newImportPrice;
                        while (true) {
                            newImportPrice = Float.parseFloat(scanner.nextLine());
                            if (newImportPrice > 0) {
                                break;
                            } else {
                                System.out.println("Giá nhập phải lớn hơn 0!");
                            }
                        }
                        products[indexUpdate].setImportPrice(newImportPrice);
                        break;
                    case 3:
                        System.out.println("Nhập vào giá bán mới:");
                        float newExportPrice;
                        while (true) {
                            newExportPrice = Float.parseFloat(scanner.nextLine());
                            if (newExportPrice >= products[indexUpdate].getImportPrice() * IAp.INTEREST) {
                                break;
                            } else {
                                System.out.println("Giá bán phải lớn hơn hoặc bằng giá nhập * INTEREST!");
                            }
                        }
                        products[indexUpdate].setExportPrice(newExportPrice);
                        break;
                    case 4:
                        System.out.println("Nhập vào tiêu đề mới (tối đa 200 ký tự):");
                        String newTitle;
                        while (true) {
                            newTitle = scanner.nextLine();
                            if (newTitle.length() <= 200) {
                                break;
                            } else {
                                System.out.println("Tiêu đề không được vượt quá 200 ký tự!");
                            }
                        }
                        products[indexUpdate].setTitle(newTitle);
                        break;
                    case 5:
                        System.out.println("Nhập vào số lượng mới:");
                        int newQuantity;
                        while (true) {
                            newQuantity = Integer.parseInt(scanner.nextLine());
                            if (newQuantity >= 0) {
                                break;
                            } else {
                                System.out.println("Số lượng không thể nhỏ hơn 0!");
                            }
                        }
                        products[indexUpdate].setQuantity(newQuantity);
                        break;
                    case 6:
                        System.out.println("Nhập vào trạng thái mới (0: Đang hoạt động, 1: Hết hàng, 2: Không hoạt động):");
                        int newStatus;
                        while (true) {
                            newStatus = Integer.parseInt(scanner.nextLine());
                            if (newStatus >= 0 && newStatus <= 2) {
                                break;
                            } else {
                                System.out.println("Trạng thái phải là 0, 1 hoặc 2!");
                            }
                        }
                        products[indexUpdate].setStatus(newStatus);
                        break;
                    case 7:
                        System.out.println("Mã danh mục mà sản phẩm thuộc về:");
                        int newIdCate = Integer.parseInt(scanner.nextLine());
                        products[indexUpdate].setStatus(newIdCate);
                        break;
                    case 8:
                        isExit = false;
                        break;
                    default:
                        System.out.println("Vui lòng chọn từ 1-8!");
                }
            } while (isExit);
        }
    }
    public static void deletePro(Scanner scanner) {
        System.out.println("Nhập vào id sản phẩm cần xóa: ");
        String id = scanner.nextLine();
        int indexDelete = findProductIndex(id);
        if (indexDelete == -1) {
            System.out.println("Không tìm thấy sản phẩm với ID này.");
        }else{
            for (int i = indexDelete; i < productIndex; i++) {
                products[i] = products[i+1];
            }
            productIndex--;
        }
    }

    public static void searchNameOrTitle(Scanner scanner) {
        System.out.println("nhập vào tên hoặc tiêu đều sản phẩm cần tìm kiếm: ");
        String proNameSearch = scanner.nextLine();
        boolean check=false;
        for (int i = 0; i < productIndex; i++) {
            if (products[i].getProName().equals(proNameSearch) || products[i].getTitle().equals(proNameSearch)) {
                products[i].displayData();
                check=true;
            }
        }
        if(!check){
            System.out.println("k tìm thấy");
        }
    }

    public static void searchPrice(Scanner scanner) {
        System.out.println("Nhập giá bắt đầu tìm: ");
        int searchStart = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giá kết thúc tìm: ");
        int searchEnd = Integer.parseInt(scanner.nextLine());
        boolean check=false;
        for (int i = 0; i < productIndex; i++) {
            if (products[i].getExportPrice() >= searchStart && products[i].getExportPrice() <= searchEnd) {
                products[i].displayData();
                check=true;
            }
        }
        if(!check){
            System.out.println("k tìm thấy");
        }
    }

    public static void orderPrice() {
        for (int i = 0; i < productIndex - 1; i++) {
            for (int j = i + 1; j < productIndex; j++) {
                if (products[i].getExportPrice() > products[j].getExportPrice()) {
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }
    }

    public static void exportProduct(Scanner scanner) {
        System.out.println("Nhập id sản phẩm muốn bán: ");
        String id = scanner.nextLine();
        int indexPro = findProductIndex(id);
        if (indexPro == -1) {
            System.out.println("Không tìm thấy sản phẩm với ID này.");
            return;
        }
        if(products[indexPro].getStatus() == 1){
            System.out.println("Sản phẩm hiện đang hết hàng");
            return;
        }
        if(products[indexPro].getStatus() == 2){
            System.out.println("Sản phẩm hiện k hoạt động");
            return;
        }
        System.out.println("Nhập số lượng muốn bán: ");
        int numberPrice = Integer.parseInt(scanner.nextLine());
        if(products[indexPro].getQuantity() > numberPrice){
            products[indexPro].setQuantity(products[indexPro].getQuantity()-numberPrice);
            System.out.println("đã bán thành công");
            return;
        }
        System.out.println("K đủ số lượng trong kho");
    }

    public static void printProductByCate() {
        for (int i = 0; i < categoriesIndex; i++) {
            int count=0;
            System.out.print("\ndanh mục: "+categories[i].getCateName()+" còn ");
            for (int j = 0; j < productIndex; j++) {
                if(categories[i].getCateId() == products[j].getIdCategorys()){
                    count+= products[j].getQuantity();
                }
            }
            System.out.print(count+" sản phẩm");
        }
    }
}