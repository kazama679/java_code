package ss12Dahinh.trenlop;

public class Employee {
//    overloading - nạp chồng
//    - điều kiện nạp chồng:
//    1.
//     - các phương thức nạp chồng p trong cùng 1 lớp
//     - các phương thức phải cùng tên
//    2. đủ
//     - số lượng tham số khác nhau
//     - thứ tự tham số khác nhau
//     - kiểu dữ liệu tham số khác nhau

    public int addd(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int add(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public float add(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }

    public void test(int number, String str){

    }

    public void test(String str, int number){

    }


}
