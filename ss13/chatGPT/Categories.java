package ss13.chatGPT;

import java.util.Scanner;

public class Categories implements IAp{
    private static int autoId = 1;
    private final int cateId;
    private String cateName;
    private int cateUp;
    private String description;
    private boolean status;

    public Categories() {
        this.cateId = autoId++;
    }

    public Categories(String cateName, int cateUp, String description, boolean status) {
        this();
        this.cateName = cateName;
        this.cateUp = cateUp;
        this.description = description;
        this.status = status;
    }

    public int getCateId() {
        return cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public int getCateUp() {
        return cateUp;
    }

    public void setCateUp(int cateUp) {
        this.cateUp = cateUp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        this.cateName = inputCateName(scanner);
        this.cateUp = inputCateUp(scanner);
        this.description = inputDescription(scanner);
        this.status = inputStatus(scanner);
    }

    private String inputCateName(Scanner scanner) {
        String name;
        do {
            System.out.print("Nhập vào tên danh mục (6-50 kí tự): ");
            name = scanner.nextLine().trim();
            if (name.length() >= 6 && name.length() <= 50) {
                return name;
            }
            System.out.println("Tên danh mục phải từ 6 đến 50 kí tự!");
        } while (true);
    }

    private int inputCateUp(Scanner scanner) {
        System.out.print("Nhập vào độ ưu tiên (số nguyên): ");
        return Integer.parseInt(scanner.nextLine().trim());
    }

    private String inputDescription(Scanner scanner) {
        String desc;
        do {
            System.out.print("Nhập mô tả sản phẩm (tối đa 255 kí tự): ");
            desc = scanner.nextLine().trim();
            if (desc.length() <= 255) {
                return desc;
            }
            System.out.println("Mô tả sản phẩm chỉ được phép có tối đa 255 kí tự!");
        } while (true);
    }

    private boolean inputStatus(Scanner scanner) {
        System.out.print("Nhập trạng thái hoạt động (true/false): ");
        return Boolean.parseBoolean(scanner.nextLine().trim());
    }

    @Override
    public void displayData() {
        System.out.println("------------------------------------------");
        System.out.printf("ID: %d\nTên danh mục: %s\nĐộ ưu tiên: %d\nMô tả danh mục: %s\nTrạng thái: %s\n",
                cateId, cateName, cateUp, description, status ? "Hoạt động" : "Không hoạt động");
    }
}
