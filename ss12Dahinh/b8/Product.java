package ss12Dahinh.b8;

public class Product {
    protected String name;
    protected double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getDiscount() {
        return 0.0;
    }

    public double getDiscount(int quantity) {
        if (quantity > 100) {
            return 5.0;
        }
        return getDiscount();
    }
    public double getFinalPrice() {
        double discount = getDiscount();
        return price - (price * discount / 100);
    }
    public double getFinalPrice(int quantity) {
        double discount = getDiscount(quantity);
        double finalPricePerItem = price - (price * discount / 100);
        return finalPricePerItem * quantity;
    }

    public void showInfo() {
        System.out.println("sản phẩm: " + name);
        System.out.println("Giá gốc: " + price);
        System.out.println("Giảm giá: " + getDiscount() + "%");
        System.out.println("Giá cuối cùng: " + getFinalPrice());
        System.out.println();
    }
}