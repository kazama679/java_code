package ss10.b8;

public class Test {
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];
        animals[0] = new Dog("Vương1", 3, "Khá giống người");
        animals[1] = new Cat("Vương2", 2, "Đỏ đen"); // nổ hũ
        for (Animals a : animals) {
            a.makeSound();
        }
    }
}