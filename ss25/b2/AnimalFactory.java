package ss25.b2;

public class AnimalFactory {
    public static Animal createAnimal(String type) {
        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                System.out.println("Không tìm thấy loại động vật: " + type);
                return null;
        }
    }
}
