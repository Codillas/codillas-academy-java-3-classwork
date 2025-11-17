package lesson_16_class_object.util;

import lesson_16_class_object.animals.Animal;
import lesson_16_class_object.animals.Fox;
import lesson_16_class_object.animals.Racoon;

public class GroomingSalon {

    private String name;

    public GroomingSalon(String name) {
        this.name = name;
    }

    public void groom(Animal animal) {

        if (animal instanceof Fox) {

            Fox fox = (Fox) animal;

            if (fox.isRabies()) {
                System.out.println("Скажених не приймаємо!");
            } else {
                animal.voice();
                System.out.println("Дякую за послугу!");
            }

        } else if (animal instanceof Racoon) {
            System.out.println("Єнотів не приймаємо!");
        } else {
            animal.voice();
            System.out.println("Дякую за послугу!");
        }
    }

}
