package ss13.baitap;

import java.util.Scanner;

public class Categories implements IAp {
    private static int autoId = 1;
    private int cateId;
    private String cateName;
    private int cateUp;
    private String description;
    private boolean status;

    public Categories() {
        this.cateId = autoId++;
    };

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

    public Categories( String cateName, int cateUp, String description, boolean status) {
        this.cateId = autoId++;
        this.cateName = cateName;
        this.cateUp = cateUp;
        this.description = description;
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào tên danh mục: ");
        while(true){
            this.cateName = scanner.nextLine();
            scanner.nextLine();
            if(this.cateName.length()<6 || this.cateName.length()>50){
                System.out.println("tên danh mục từ 6-50 kí tự!");
            }else{
                break;
            }
        }
        System.out.println("Nhập vào độ ưu tiên (số nguyên): ");
        this.cateUp = Integer.parseInt(scanner.nextLine());
        System.out.println("Mô tả sản phẩm: ");
        while(true){
            this.description = scanner.next();
            scanner.nextLine();
            if(this.description.length()>255){
                System.out.println("mô tả sản phẩm chỉ đc phép có 255 kí tự");
            }else{
                break;
            }
        }
        System.out.println("trạng thái hoạt động(true-false): ");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("------------------------------------------");
        System.out.println("id: " + cateId);
        System.out.println("tên danh mục: " + cateName);
        System.out.println("độ ưu tiên: " + cateUp);
        System.out.println("mô tả danh mục: " + description);
        System.out.println("trạng thái: " + (status ? "Hoạt động": "Không hoạt động"));
    }
}