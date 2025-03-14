package ss10;

public class B2 {
//    1. Kế thừa là gì?
//    Kế thừa (Inheritance) cho phép lớp con nhận các thuộc tính và phương thức từ lớp cha,
//    giúp tái sử dụng mã nguồn, mở rộng chức năng và dễ bảo trì.

//    2. Khác biệt giữa kế thừa và đóng gói
//    Kế thừa (extends):
//    Mục đích: Tái sử dụng, mở rộng
//    Cơ chế: Lớp con kế thừa từ lớp cha
//    Ứng dụng: Xây dựng hệ thống phân cấp

//    Đóng gói (private, getter/setter):
//    Mục đích: Bảo vệ dữ liệu
//    Cơ chế: Hạn chế truy cập trực tiếp
//    Ứng dụng: Kiểm soát truy cập dữ liệu

//    3. Ví dụ kế thừa (extends):
//    class Animal {
//        String name;
//        void eat() { System.out.println(name + " đang ăn."); }
//    }
//    class Dog extends Animal {
//        void bark() { System.out.println(name + " đang sủa."); }
//    }
//    public class Main {
//        public static void main(String[] args) {
//            Dog dog = new Dog();
//            dog.name = "Cún con";
//            dog.eat();  // Kế thừa từ Animal
//            dog.bark(); // Phương thức riêng
//        }
//    }
    
//    4. Lợi ích & Hạn chế
//          - Lợi ích: Tái sử dụng mã nguồn, dễ mở rộng, hỗ trợ đa hình.
//          - Hạn chế: Phụ thuộc lớp cha, khó bảo trì nếu thay đổi lớn, không hỗ trợ kế thừa đa lớp.
}