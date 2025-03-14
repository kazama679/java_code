package ss10.b8;

public class Cat extends Animals {
    private String furColor;
    public Cat(String name, int age, String furColor) {
        super(name, age);
        if (furColor == null || furColor.trim().isEmpty()) {
            System.out.println("màu lông k đc để trống");
            return;
        }
        this.furColor  = furColor;
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + getName() + ", tuổi: " + getAge() + ", màu lông: " + furColor);
    }

    @Override
    public void makeSound(){
        System.out.println("Meow Meow");
    }
}
