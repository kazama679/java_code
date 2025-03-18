package ss13.chatGPT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int MAX_CATEGORIES = 100;
    private static final int MAX_PRODUCTS = 100;
    private static List<Categories> categories = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeData();
        showMainMenu();
    }

    private static void initializeData() {
        categories.add(new Categories("Laptop", 1, "Mô tả 1", true));
        categories.add(new Categories("Điện thoại", 2, "Mô tả 2", false));
        categories.add(new Categories("Túi sách", 1, "Mô tả 3", true));

        products.add(new Product("Mô tả sản phẩm 1", 120000, 1, 100000, "2", "Laptop gaming", 12, 0, "Tiêu đề sp1"));
        products.add(new Product("Mô tả sản phẩm 2", 150000, 2, 100000, "C0002", "Điện thoại X", 13, 1, "Tiêu đề sp2"));
        products.add(new Product("Mô tả sản phẩm ", 2000000, 1, 100000, "C0003", "Laptop văn phòng", 14, 2, "Tiêu đề sp3"));
    }

    private static void showMainMenu() {
        while (true) {
            System.out.print("*********************SHOP MENU*********************\n" +
                    "1. Quản lý danh mục\n" +
                    "2. Quản lý sản phẩm\n" +
                    "3. Thoát\n" +
                    "Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showCategoryMenu();
                    break;
                case 2:
                    showProductMenu();
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void showCategoryMenu() {
        int choice;
        do {
            System.out.print("********************CATEGORIE MANAGEMENT*********************\n" +
                    "1. Danh sách danh mục\n" +
                    "2. Thêm mới danh mục\n" +
                    "3. Cập nhật danh mục\n" +
                    "4. Xóa danh mục\n" +
                    "5. Tìm kiếm danh mục theo tên\n" +
                    "6. Thoát\n" +
                    "Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayCategories();
                    break;
                case 2:
                    addCategory();
                    break;
                case 3:
                    updateCategory();
                    break;
                case 4:
                    deleteCategory();
                    break;
                case 5:
                    searchCategoryByName();
                    break;
                case 6:
                    System.out.println("Thoát menu danh mục.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 6);
    }

    private static void showProductMenu() {
        int choice;
        do {
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
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchProductByNameOrTitle();
                    break;
                case 6:
                    searchProductByPriceRange();
                    break;
                case 7:
                    sortProductsByPrice();
                    break;
                case 8:
                    sellProduct();
                    break;
                case 9:
                    printProductCountByCategory();
                    break;
                case 10:
                    System.out.println("Thoát menu sản phẩm.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 10);
    }

    private static void displayCategories() {
        if (categories.isEmpty()) {
            System.out.println("Danh sách danh mục rỗng!");
        } else {
            categories.forEach(Categories::displayData);
        }
    }

    private static void addCategory() {
        if (categories.size() < MAX_CATEGORIES) {
            Categories category = new Categories();
            category.inputData(scanner);
            categories.add(category);
        } else {
            System.out.println("Danh sách danh mục đã đầy!");
        }
    }

    private static void updateCategory() {
        System.out.println("Nhập vào id danh mục cần cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());
        Categories category = findCategoryById(id);
        if (category == null) {
            System.out.println("Không tìm thấy danh mục với ID này.");
        } else {
            category.updateData(scanner);
        }
    }

    private static void deleteCategory() {
        System.out.println("Nhập vào id danh mục cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        Categories category = findCategoryById(id);
        if (category == null) {
            System.out.println("Không tìm thấy danh mục với ID này.");
        } else {
            if (isCategoryInUse(id)) {
                System.out.println("Không thể xóa danh mục này vì còn sản phẩm!");
            } else {
                categories.remove(category);
                System.out.println("Đã xóa danh mục thành công.");
            }
        }
    }

    private static void searchCategoryByName() {
        System.out.println("Nhập vào tên danh mục cần tìm kiếm: ");
        String name = scanner.nextLine();
        categories.stream()
                .filter(c -> c.getCateName().equals(name))
                .forEach(Categories::displayData);
    }

    private static void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng!");
        } else {
            products.forEach(Product::displayData);
        }
    }

    private static void addProduct() {
        if (products.size() < MAX_PRODUCTS) {
            Product product = new Product();
            product.inputData(scanner);
            products.add(product);
        } else {
            System.out.println("Danh sách sản phẩm đã đầy!");
        }
    }

    private static void updateProduct() {
        System.out.println("Nhập vào ID sản phẩm cần cập nhật: ");
        String id = scanner.nextLine();
        Product product = findProductById(id);
        if (product == null) {
            System.out.println("Không tìm thấy sản phẩm với ID này.");
        } else {
            product.updateData(scanner);
        }
    }

    private static void deleteProduct() {
        System.out.println("Nhập vào ID sản phẩm cần xóa: ");
        String id = scanner.nextLine();
        Product product = findProductById(id);
        if (product == null) {
            System.out.println("Không tìm thấy sản phẩm với ID này.");
        } else {
            products.remove(product);
            System.out.println("Đã xóa sản phẩm thành công.");
        }
    }

    private static void searchProductByNameOrTitle() {
        System.out.println("Nhập vào tên hoặc tiêu đề sản phẩm cần tìm kiếm: ");
        String searchTerm = scanner.nextLine();
        products.stream()
                .filter(p -> p.getProName().equals(searchTerm) || p.getTitle().equals(searchTerm))
                .forEach(Product::displayData);
    }

    private static void searchProductByPriceRange() {
        System.out.println("Nhập giá bắt đầu tìm: ");
        int startPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá kết thúc tìm: ");
        int endPrice = Integer.parseInt(scanner.nextLine());
        products.stream()
                .filter(p -> p.getExportPrice() >= startPrice && p.getExportPrice() <= endPrice)
                .forEach(Product::displayData);
    }

    private static void sortProductsByPrice() {
        products.sort((p1, p2) -> Float.compare(p1.getExportPrice(), p2.getExportPrice()));
        System.out.println("Đã sắp xếp sản phẩm theo giá bán tăng dần.");
    }

    private static void sellProduct() {
        System.out.println("Nhập ID sản phẩm muốn bán: ");
        String id = scanner.nextLine();
        Product product = findProductById(id);
        if (product == null) {
            System.out.println("Không tìm thấy sản phẩm với ID này.");
            return;
        }
        if (product.getStatus() == ProductStatus.OUT_OF_STOCK) {
            System.out.println("Sản phẩm hiện đang hết hàng.");
            return;
        }
        if (product.getStatus() == ProductStatus.INACTIVE) {
            System.out.println("Sản phẩm hiện không hoạt động.");
            return;
        }
        System.out.println("Nhập số lượng muốn bán: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        if (product.getQuantity() >= quantity) {
            product.setQuantity(product.getQuantity() - quantity);
            System.out.println("Đã bán thành công.");
        } else {
            System.out.println("Không đủ số lượng trong kho.");
        }
    }

    private static void printProductCountByCategory() {
        categories.forEach(c -> {
            int count = (int) products.stream()
                    .filter(p -> p.getIdCategorys() == c.getCateId())
                    .count();
            System.out.println("Danh mục: " + c.getCateName() + " có " + count + " sản phẩm.");
        });
    }

    private static Categories findCategoryById(int id) {
        return categories.stream()
                .filter(c -> c.getCateId() == id)
                .findFirst()
                .orElse(null);
    }

    private static Product findProductById(String id) {
        return products.stream()
                .filter(p -> p.getProId().equals(id))
                .findFirst()
                .orElse(null);
    }

    private static boolean isCategoryInUse(int categoryId) {
        return products.stream().anyMatch(p -> p.getIdCategorys() == categoryId);
    }
}