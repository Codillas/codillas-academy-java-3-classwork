package lesson_33_optional;

import lesson_16_class_object.animals.Animal;

import java.util.Optional;

// клікнути на назву класа і натиснути
// macOS: option + Enter
// windows: alt + Enter
// потім натиснути create test
public class Forest {

    private Animal[] animals;
    private int currentAnimalsCount = 0;

    public Forest(int animalsAmount) {
        this.animals = new Animal[animalsAmount];
        // {null, null, null, ... null}
    }

    public int getAnimalsAmount() {
        return this.animals.length;
    }

    public void addAnimal(Animal animal) throws ForestIsFullException {
        if (isFull()){
            throw new ForestIsFullException(animal);
        } else {
            animals[currentAnimalsCount] = animal;
            currentAnimalsCount++;
        }
    }

    private boolean isFull() {
        if (this.currentAnimalsCount == animals.length) {
            return true;
        } else {
            return false;
        }
    }

    public Optional<Animal> getFirstAnimal() {
        return Optional.ofNullable(this.animals[0]);
    }

}
