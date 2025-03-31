package ss21.baiHackathon.entity;

import ss21.baiHackathon.presentation.ShopManagement;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Order implements IApp {
    private static int idAuto=0;
    private int id;
    private Customer customer;
    private LocalDate orderDate;
    private double totalAmount;
    private Boolean status;

    public Customer getCustomer() {
        return customer;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Order() {
        this.id = ++idAuto;
    }

    public Order(Customer customer, LocalDate orderDate, double totalAmount, Boolean status) {
        this.customer = customer;
        this.id = ++idAuto;
        this.orderDate = orderDate;
        this.status = status;
        this.totalAmount = totalAmount;
    }

    @Override
    public void inputData(Scanner scanner) {
        this.customer = choiceCustomer(scanner);
        this.orderDate = inputOrderDate(scanner);
        System.out.println("Nhập vào tổng tiền của đơn hàng: ");
        this.totalAmount = Double.parseDouble(scanner.nextLine());
        this.status = false;
    }

    public Customer choiceCustomer(Scanner scanner) {
        System.out.println("chọn khách hàng: ");
        while(true){
            if(ShopManagement.listCustomers.isEmpty()){
                return null;
            }
            ShopManagement.listCustomers.forEach(customer -> System.out.printf("%d. %s\n",customer.getId(),customer.getName()));
            System.out.println("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            OptionalInt indexCustomer = IntStream.range(0, ShopManagement.listCustomers.size()).filter(index -> ShopManagement.listCustomers.get(index).getId() == choice).findFirst();
            if(indexCustomer.isPresent()){
                return ShopManagement.listCustomers.get(choice);
            }
            System.out.println("Vui lòng chọn đúng mã khách hàng");
        }
    }

    public LocalDate inputOrderDate(Scanner scanner) {
        while(true){
            try {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                System.out.println("Nhập vào ngày nhận hàng(dd/MM/yyyy): ");
                return LocalDate.parse(scanner.nextLine(), dtf);
            }catch (DateTimeException e1){
                System.out.println("K đúng định dạng dd/MM/yyyy");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString(){
        return "Mã đơn hàng: "+id+", Khách hàng: "+(customer==null?"Không có khách hàng": customer.getName())+", Ngày đặt hàng: "+orderDate+", Tổng tiền: "+totalAmount+"Trạng thái: "+(status?"Đã giao hàng":"Chưa giao hàng");
    }
}
