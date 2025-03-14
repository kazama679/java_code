package ss10.b8;

import ss10.b8.Animals;

public class Dog extends Animals {
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        if (breed == null || breed.trim().isEmpty()) {
            System.out.println("Giống chó k đc để trống");
            return;
        }
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + getName() + ", tuổi: " + getAge() + ", giống chó: " + breed);
    }

    @Override
    public void makeSound(){
        System.out.println("Woof Woof");
    }
}
