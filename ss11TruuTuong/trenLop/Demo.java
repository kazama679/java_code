package ss11TruuTuong.trenLop;

public class Demo {
    public static void main(String[] args) {
        // khởi tạo đối tượng person từ lớp person
        Person person = new Person() {
            @Override
            public int addTwoNumbers(int firstNumber, int secondNumber) {
                return firstNumber + secondNumber;
            }

            @Override
            public void hello() {
                System.out.println("hello");
            }
        };
    }
}
