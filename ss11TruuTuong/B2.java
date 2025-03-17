//Định nghĩa
//  Tính trừu tượng giúp ẩn đi chi tiết phức tạp, chỉ cung cấp những chức năng cần thiết cho người dùng.
// Nó giúp phần mềm dễ bảo trì, mở rộng và giảm sự phụ thuộc giữa các thành phần.

//Phân tích:
//- Lý do cần thiết: Giúp quản lý hệ thống phức tạp, tập trung vào cách sử dụng thay vì chi tiết triển khai.
//- Sự khác biệt giữa lớp trừu tượng và giao diện:
//- Lớp trừu tượng: Chứa cả phương thức có và không có cài đặt, hỗ trợ biến instance, chỉ kế thừa một lớp.
//- Giao diện: Chỉ có phương thức trừu tượng (trước Java 8), không có biến instance, hỗ trợ đa kế thừa.

//Ví dụ thực tế:
// - Máy ATM: Người dùng chỉ cần biết rút tiền, không cần hiểu hệ thống ngân hàng.
// - Điều khiển TV: Chỉ cần nhấn nút mà không cần biết cách TV xử lý bên trong.
// - Ô tô: Người lái chỉ điều khiển, không cần hiểu động cơ hoạt động thế nào.