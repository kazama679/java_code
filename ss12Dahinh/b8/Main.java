package ss12Dahinh.b8;

public class Main {
    public static void main(String[] args) {
        Product phone = new Electronics("đt", 1000);
        Product tshirt = new Clothing("áo", 50);
        Product apple = new Food("chuối", 2);
        phone.showInfo();
        tshirt.showInfo();
        apple.showInfo();
        int quantity = 20;
        System.out.println("giá cuối " + quantity + " đt: " + phone.getFinalPrice(quantity));
        System.out.println("giá cuối " + quantity + " áo: " + tshirt.getFinalPrice(quantity));
        System.out.println("giá cuối " + quantity + " chuối: " + apple.getFinalPrice(quantity));
    }
}