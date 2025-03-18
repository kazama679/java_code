package ss13.chatGPT;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Product implements IAp {
    private String proId;
    private String proName;
    private float importPrice;
    private float exportPrice;
    private String title;
    private String description;
    private int quantity;
    private int idCategory;
    private int status;

    public Product() {}

    public Product(String proId, String proName, float importPrice, float exportPrice, String title, String description, int quantity, int idCategory, int status) {
        this.proId = proId;
        this.proName = proName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.idCategory = idCategory;
        this.status = status;
    }

    public String getProId() { return proId; }
    public void setProId(String proId) { this.proId = proId; }
    public String getProName() { return proName; }
    public void setProName(String proName) { this.proName = proName; }
    public float getImportPrice() { return importPrice; }
    public void setImportPrice(float importPrice) { this.importPrice = importPrice; }
    public float getExportPrice() { return exportPrice; }
    public void setExportPrice(float exportPrice) { this.exportPrice = exportPrice; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public int getIdCategory() { return idCategory; }
    public void setIdCategory(int idCategory) { this.idCategory = idCategory; }
    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }

    @Override
    public void inputData(Scanner scanner) {
        proId = inputWithValidation(scanner, "Nhập id sản phẩm gồm 5 ký tự, bắt đầu là ‘C’, ‘E’, ‘T’:", "(C|E|T)\\d{4}", "Định dạng id không đúng, vui lòng nhập lại");
        proName = inputWithValidation(scanner, "Nhập tên sản phẩm từ 10-100 kí tự:", ".{10,100}", "Tên sản phẩm phải từ 10-100 ký tự");
        importPrice = inputFloat(scanner, "Giá nhập sản phẩm:", "Giá nhập phải lớn hơn 0");
        exportPrice = inputFloat(scanner, "Giá bán sản phẩm:", "Giá bán phải lớn hơn hoặc bằng giá nhập * INTEREST");
        title = inputWithValidation(scanner, "Nhập tiêu đề sản phẩm tối đa 200 kí tự:", ".{0,200}", "Tiêu đề tối đa 200 ký tự");
        quantity = inputInt(scanner, "Nhập số lượng sản phẩm:", "Số lượng không thể nhỏ hơn 0");
        idCategory = inputInt(scanner, "Mã danh mục mà sản phẩm thuộc về:", "Mã danh mục không hợp lệ");
        status = inputInt(scanner, "Trạng thái sản phẩm (0: Đang hoạt động – 1: hết hàng – 2: không hoạt động):", "Trạng thái không hợp lệ");
    }

    private String inputWithValidation(Scanner scanner, String prompt, String regex, String errorMessage) {
        String input;
        do {
            System.out.println(prompt);
            input = scanner.nextLine().trim();
            if (Pattern.matches(regex, input)) {
                break;
            } else {
                System.err.println(errorMessage);
            }
        } while (true);
        return input;
    }

    private float inputFloat(Scanner scanner, String prompt, String errorMessage) {
        float value;
        do {
            System.out.println(prompt);
            try {
                value = Float.parseFloat(scanner.nextLine().trim());
                if (value > 0) {
                    break;
                }
            } catch (NumberFormatException e) {}
            System.err.println(errorMessage);
        } while (true);
        return value;
    }

    private int inputInt(Scanner scanner, String prompt, String errorMessage) {
        int value;
        do {
            System.out.println(prompt);
            try {
                value = Integer.parseInt(scanner.nextLine().trim());
                if (value >= 0) {
                    break;
                }
            } catch (NumberFormatException e) {}
            System.err.println(errorMessage);
        } while (true);
        return value;
    }

    @Override
    public void displayData() {
        System.out.println("------------------------------------------");
        System.out.printf("Mã sản phẩm: %s\nTên sản phẩm: %s\nGiá nhập: %.2f\nGía xuất: %.2f\nTiêu đề: %s\nMô tả: %s\nMã danh mục: %d\nTrạng thái: %s\n",
                proId, proName, importPrice, exportPrice, title, description, idCategory,
                status == 0 ? "Đang hoạt động" : status == 1 ? "Hết hàng" : "Không hoạt động");
    }
}