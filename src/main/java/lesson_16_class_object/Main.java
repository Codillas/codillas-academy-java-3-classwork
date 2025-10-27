package lesson_16_class_object;

import lesson_16_class_object.animals.Cat;

public class Main {
    static void main() {

        Cat barsik = new Cat();
        barsik.setName("Barsik");
        barsik.setAge(8);
        barsik.setWeight(3.5);

        System.out.println("Кота звати: " + barsik.getName());
        System.out.println("Вік кота: " + barsik.getAge());
        System.out.println("Вага кота: " + barsik.getWeight());

        Cat amour = new Cat("Amour", 16, 4.1);

        System.out.println("Кота звати: " + amour.getName());
        System.out.println("Вік кота: " + amour.getAge());
        System.out.println("Вага кота: " + amour.getWeight());


        // toString()
        System.out.println(amour.toString());
    }
}
