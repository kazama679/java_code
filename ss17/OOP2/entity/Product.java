package ss17.OOP2.entity;

import ss17.OOP2.validate.Validator;

import java.util.Scanner;

public class Product {
    private String productid;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String description;
    private boolean status;

    public Product(String description, float exportPrice, float importPrice, String productid, String productName, int quantity, boolean status) {
        this.description = description;
        this.exportPrice = exportPrice;
        this.importPrice = importPrice;
        this.profit = calProfit();
        this.productid = productid;
        this.productName = productName;
        this.quantity = quantity;
        this.status = status;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit() {
        this.profit = calProfit();
    }

    public Product() {
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

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData(Scanner scanner, Product[] arrProduct){
        System.out.println("Nhập id: ");
        while (true) {
            String id = Validator.validateString(scanner, 4, 4);
            if (id == null || id.trim().isEmpty()) {  // Kiểm tra id có rỗng không
                System.out.println("ID không hợp lệ, vui lòng nhập lại!");
                continue;
            }
            boolean isDuplicate = false;
            for (Product p : arrProduct) {
                if (p != null && p.getProductid() != null && p.getProductid().equals(id)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                this.productid = id;
                break;
            }
            System.out.println("ID đã tồn tại, nhập lại!");
        }

        System.out.println("Nhập tên sản phẩm (6-50 ký tự, không trùng): ");
        while (true) {
            String name = Validator.validateString(scanner, 6, 50);
            if (name == null || name.trim().isEmpty()) {
                System.out.println("Tên sản phẩm không hợp lệ, vui lòng nhập lại!");
                continue;
            }
            boolean isDuplicate = false;
            for (Product p : arrProduct) {
                if (p != null && p.getProductName() != null && p.getProductName().equalsIgnoreCase(name)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                this.productName = name;
                break;
            }
            System.out.println("Tên sản phẩm đã tồn tại, nhập lại!");
        }

        System.out.println("Nhập giá nhập: ");
        this.importPrice = Validator.validateFloat(scanner, 0);

        System.out.println("Nhập giá xuất (ít nhất 20% lớn hơn giá nhập): ");
        while (true) {
            this.exportPrice = Validator.validateFloat(scanner, importPrice * 1.2f);
            if (exportPrice >= importPrice * 1.2f) {
                break;
            }
            System.out.println("Giá xuất phải lớn hơn ít nhất 20% so với giá nhập, nhập lại: ");
        }

        this.profit = calProfit();

        System.out.println("Nhập số lượng: ");
        this.quantity = Validator.validateInt(scanner, 1);

        System.out.println("Nhập mô tả sản phẩm: ");
        this.description = scanner.nextLine();

        System.out.println("Nhập trạng thái sản phẩm (true - Đang bán, false - Không bán): ");
        while (true) {
            String statusInput = scanner.nextLine().trim().toLowerCase();
            if (statusInput.equals("true")) {
                this.status = true;
                break;
            } else if (statusInput.equals("false")) {
                this.status = false;
                break;
            }
            System.out.println("Chỉ được nhập 'true' hoặc 'false', nhập lại:");
        }
    }

    public void displayData() {
        System.out.println("--------------------------------");
        System.out.println("id: " + productid);
        System.out.println("tên: " + productName);
        System.out.println("giá nhập: " + importPrice);
        System.out.println("giá bán: " + exportPrice);
        System.out.println("lợi nhuận: " + profit);
        System.out.println("số lượng: " + quantity);
        System.out.println("mô tả: " + description);
        System.out.println("trạng thái: " + (status?"Đang bán":"Không bán"));
    }

    public float calProfit(){
        return exportPrice - importPrice;
    };
}
