package ss12Dahinh.trenlop;

public class Story extends Book {
    /*
    * overiding ghi đè
    * điều kiên cần
    *   - p có quan hệ kế thừa
    * 2. điều kiện đủ
    *  - cùng kiểu dữ liệu trả về, cùng tên phương thức, cùng tham số
    *  - bổ từ truy cập của phương thức có phamk vi truy cập
    *
    *
    * */

    protected void displayData( ) {
        System.out.println("thông tin truyện");
    }
}
