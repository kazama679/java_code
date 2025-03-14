package ss10;

public class Bai1 {
// 1. Tính đóng gói là gì? Tại sao quan trọng?
// Tính đóng gói (Encapsulation) là cơ chế ẩn giấu dữ liệu trong một lớp, chỉ cho phép truy cập thông qua các phương thức cụ thể.
// Quan trọng vì:
//  - Bảo vệ dữ liệu khỏi thay đổi không kiểm soát.
//  - Kiểm soát quyền truy cập.
//  - Dễ bảo trì, mở rộng.

// 2. Cách áp dụng tính đóng gói trong Java
//    - Khai báo thuộc tính private.
//    - Sử dụng phương thức getter (đọc dữ liệu) và setter (gán dữ liệu).

// 3. Ví dụ:
    class Person {
        private String name;
        private int age;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }
// 4. Lợi ích
//   - Bảo vệ dữ liệu.
//   - Kiểm soát truy cập.
//   - Dễ dàng thay đổi logic mà không ảnh hưởng đến mã khác.
}
