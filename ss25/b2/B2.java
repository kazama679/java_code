package ss25.b2;

public class B2 {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("dog");
        if (dog != null) dog.speak();
        Animal cat = AnimalFactory.createAnimal("cat");
        if (cat != null) cat.speak();
        Animal unknown = AnimalFactory.createAnimal("tiger");
        if (unknown != null) unknown.speak();
    }
}
