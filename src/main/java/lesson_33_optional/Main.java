package lesson_33_optional;

import lesson_16_class_object.animals.Cat;
import lesson_16_class_object.animals.Fox;
import lesson_16_class_object.animals.Racoon;

public class Main {

    static void main() {
        Forest forest = new Forest(2);

        Fox fox = new Fox();
        Cat cat = new Cat();
        Racoon racoon = new Racoon();

        try {
        forest.addAnimal(fox);
        forest.addAnimal(cat);
        forest.addAnimal(racoon);
        } catch (ForestIsFullException e) {
            System.out.println(e.getMessage());
        }
    }
}
