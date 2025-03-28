package ss20.BTVN.business;

import ss20.BTVN.entity.Order;
import ss20.BTVN.presentation.ShopManagement;

import java.util.List;
import java.util.Scanner;

public interface IOrderBusiness {
    void addOrder(Scanner scanner);
    void displayOrders();
    void updateOrderStatus(Scanner scanner);
    List<Order> getOrderOverdue();
    List<Order> getOrderDelivied();
    default double getTotalRevenue(){
        return ShopManagement.listOrders.stream().filter(Order::isStatus).mapToDouble(Order::getTotalAmount).sum();
    }
}
