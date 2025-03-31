package ss21.b10;

public class CartItem {
    private Product product;
    private int quantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public CartItem() {
    }

    @Override
    public String toString() {
        return "ID: "+product.getId()+"Tên sản phẩm: "+product.getName()+", Giá sp: "+product.getPrice()+", số lượng mua: "+quantity;
    }
}
