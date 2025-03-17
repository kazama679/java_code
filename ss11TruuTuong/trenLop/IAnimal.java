package ss11TruuTuong.trenLop;

import java.util.Scanner;

public interface IAnimal {
    // các hằng số
    public static final String NAME = "Animal";
    int AGE = 18;
    // các phương thức trừu tượng
    public abstract void inputData(Scanner sc);
    void displayData();
}
