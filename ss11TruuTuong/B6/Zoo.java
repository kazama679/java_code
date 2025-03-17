package ss11TruuTuong.B6;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    public void moveAllAnimals() {
        for (Animal animal : animals) {
            animal.move();
        }
    }
}
