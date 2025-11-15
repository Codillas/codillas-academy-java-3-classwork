package lesson_16_class_object;

import lesson_16_class_object.animals.Breed;
import lesson_16_class_object.animals.Cat;
import lesson_16_class_object.animals.Fox;
import lesson_16_class_object.animals.Racoon;
import lesson_16_class_object.food.Fish;
import lesson_16_class_object.fun.Quack;
import lesson_16_class_object.util.GroomingSalon;

public class Main {
    static void main() {

        Cat barsik = new Cat();
        barsik.setName("Barsik");
        barsik.setAge(8);
        barsik.setWeight(3.5);
        barsik.setBreed(Breed.valueOf("ABESSIN"));

        System.out.println("Породи котів, які нам відомі:");
        Breed[] breeds = Breed.values();
        for (Breed breed : breeds) {
            System.out.println(breed);
        }

        System.out.println("Кота звати: " + barsik.getName());
        System.out.println("Вік кота: " + barsik.getAge());
        System.out.println("Вага кота: " + barsik.getWeight());
        System.out.println("Порода кота: " + barsik.getBreed());

        Cat amour = new Cat("Amour", 16, 4.1, Breed.SERVAL);
        Cat cat2 = new Cat("Amour", 16, 4.1, Breed.SERVAL);

        System.out.println("Кота звати: " + amour.getName());
        System.out.println("Вік кота: " + amour.getAge());
        System.out.println("Вага кота: " + amour.getWeight());

        Breed breed = amour.getBreed();
        String breedString = breed.name();


        // toString()
        System.out.println(amour.toString());

        amour.voice();
        amour.voice("Покормииии!");

        Fish fish = new Fish("Лосось");
        Quack quack = amour.eat(fish);

        System.out.println(quack.getType());


        // switch example
        Breed amourBreed = amour.getBreed();
        switch (amourBreed) {
            case ABESSIN -> System.out.println("Абесіе");
            case SERVAL -> System.out.println("Сервал");
            default -> System.out.println("Якась інша порода");
        }

        System.out.println(barsik.equals(amour));
        System.out.println(barsik.hashCode());
        System.out.println(amour.hashCode());

        Fox fox = new Fox();
        fox.setAge(3);
        fox.setWeight(4);
        fox.setRabies(false);


        System.out.println("------------------------");
        GroomingSalon groomingSalon = new GroomingSalon("Paws & Tailsssss");

        groomingSalon.groom(amour);
        groomingSalon.groom(fox);

        Racoon racoon = new Racoon();
        groomingSalon.groom(racoon);


    }
}
