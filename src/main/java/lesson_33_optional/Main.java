package lesson_33_optional;

import lesson_16_class_object.animals.Animal;
import lesson_16_class_object.animals.Cat;
import lesson_16_class_object.animals.Fox;
import lesson_16_class_object.animals.Racoon;

import java.util.Optional;

public class Main {

    static void main() {
        Forest forest = new Forest(2);

        Fox fox = new Fox();
        fox.setAge(3);

        Cat cat = new Cat();
        cat.setAge(4);

        Racoon racoon = new Racoon();
        racoon.setAge(5);

        try {
        forest.addAnimal(fox);
        forest.addAnimal(cat);
        forest.addAnimal(racoon);
        } catch (ForestIsFullException e) {
            System.out.println(e.getMessage());
        }

        Optional<Animal> optionalAnimal = forest.getFirstAnimal();

        if (optionalAnimal.isPresent()) {
            Animal animal = optionalAnimal.get();
            animal.voice();
        } else {
            System.out.println("Тварини немає");
        }

        Optional<Animal> animalOptional = forest.getAnimalByAge(5);

        if (animalOptional.isPresent()) {
            Animal animal = animalOptional.get();
            animal.voice();
        } else {
            System.out.println("Такої тварини не існує!");
        }

    }
}
