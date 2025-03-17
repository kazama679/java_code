package ss11TruuTuong.B6;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal lion = new Lion("Lion1", 5);
        Animal elephant = new Elephant("Elephant1", 10);
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.makeAllSounds();
        zoo.moveAllAnimals();
    }
}
