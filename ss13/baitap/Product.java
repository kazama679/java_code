package ss13.baitap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Product implements IAp{
    private String proId;
    private String proName;
    private float importPrice;
    private float exportPrice;
    private String title;
    private String description;
    private int quantity;
    private int idCategorys;
    private int status;

    public Product(String description, float exportPrice, int idCategorys, float importPrice, String proId, String proName, int quantity, int status, String title) {
        this.description = description;
        this.exportPrice = exportPrice;
        this.idCategorys = idCategorys;
        this.importPrice = importPrice;
        this.proId = proId;
        this.proName = proName;
        this.quantity = quantity;
        this.status = status;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getIdCategorys() {
        return idCategorys;
    }

    public void setIdCategorys(int idCategorys) {
        this.idCategorys = idCategorys;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product() {
    }


    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập id sản phẩm gồm 5 ký tự, bắt đầu là ‘C’, ‘E’, ‘T’ :");
        String idRegex = "(C|E|T)\\d{4}";
        do {
            this.proId = scanner.nextLine();
            if (Pattern.matches(idRegex, this.proId)) {
                break;
            } else {
                System.err.println("Định dạng id không đúng, vui lòng nhập lại");
            }
        } while (true);
        System.out.println("Nhập tên sản phẩm từ 10-100 kí tự:");
        do {
            this.proName = scanner.nextLine();
            if (this.proName.length()>=10 && this.proName.length()<=100) {
                break;
            } else {
                System.err.println("Định dạng tên không đúng, vui lòng nhập lại");
            }
        } while (true);
        System.out.println("Giá nhập sản phẩm:");
        do {
            this.importPrice = Float.parseFloat(scanner.nextLine());
            if (this.importPrice>0) {
                break;
            } else {
                System.err.println("Giá nhập sản phẩm k đc nhỏ hơn 1, vui lòng nhập lại");
            }
        } while (true);
        System.out.println("Giá bán sản phẩm:");
        do {
            this.exportPrice = Float.parseFloat(scanner.nextLine());
            if (this.exportPrice>=this.importPrice*INTEREST) {
                break;
            } else {
                System.err.println("Giá bán sản phẩm phải có giá trị lớn hơn tối thiểu INTEREST, vui lòng nhập lại");
            }
        } while (true);
        System.out.println("Nhập tiêu đề sản phẩm tối đa 200 kí tự:");
        do {
            this.title = scanner.nextLine();
            if (this.title.length()<=200) {
                break;
            } else {
                System.err.println("Định dạng tên không đúng, vui lòng nhập lại");
            }
        } while (true);
        System.out.println("Nhập số lượng sản phẩm:");
        do {
            this.quantity = Integer.parseInt(scanner.nextLine());
            if (this.quantity>=0) {
                break;
            } else {
                System.err.println("số lượng sản phẩm k thể nhỏ hơn 0, vui lòng nhập lại");
            }
        } while (true);
        System.out.println("Mã danh mục mà sản phẩm thuộc về:");
        this.idCategorys = Integer.parseInt(scanner.nextLine());
        System.out.println("Trạng thái sản phẩm (0: Đang hoạt động – 1: hết hàng – 2: không hoạt động):");
        this.idCategorys = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("------------------------------------------");
        System.out.println("Mã sản phẩm: " + proId);
        System.out.println("Tên sản phẩm: " + proName);
        System.out.println("Giá nhập: " + importPrice);
        System.out.println("Gía xuất: " + exportPrice);
        System.out.println("tiêu đề sản phẩm: " + title);
        System.out.println("mô tả: " + description);
        System.out.println("mã danh mục: " + idCategorys);
        System.out.println("trạng thái: " + (status==0 ? "Đang hoạt động" : status==1 ? "Hết hàng" : "Không hoạt động"));
    }
}