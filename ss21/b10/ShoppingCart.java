package ss21.b10;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static final List<CartItem> cartItems = new ArrayList<>();

    public static void addToCart(Product product, int quantity){
        boolean check = false;
        for (CartItem cartItem : cartItems) {
            if (cartItem.getProduct().getId().equals(product.getId())) {
                cartItem.setQuantity(cartItem.getQuantity() + quantity);
                check = true;
            }
        }
        if (!check) {
            cartItems.add(new CartItem(product, quantity));
        }
    }

    public static void removeFromCart(String productId){
        for (CartItem cartItem : cartItems) {
            if (cartItem.getProduct().getId().equals(productId)) {
                cartItems.remove(cartItem);
            }
        }
    }

    public static void displayCart(){
        cartItems.forEach(System.out::println);
    }

    public static void checkout(){
        System.out.println("Tổng tiền cần thanh toán: "+cartItems.stream().mapToDouble(cart -> cart.getProduct().getPrice()*cart.getQuantity()).sum());
    }
}
