package lesson_33_optional;

import lesson_16_class_object.animals.Animal;

public class ForestIsFullException extends Exception {

    public ForestIsFullException(Animal animal) {
        super("The Forest is full. Can't add the animal: " + animal);
    }
}
