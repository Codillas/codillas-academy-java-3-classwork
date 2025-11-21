package lesson_33_optional;

import lesson_16_class_object.animals.Animal;
import lesson_16_class_object.animals.Cat;
import lesson_16_class_object.animals.Racoon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;


class ForestTest {

    // банальний тест на створення лісу
    // тестовий метод повинен мати анотацію @Test
    @Test
    // тестовий метод не повинен нічого повертати (void)
    // і повинен мати гарну назву, що описує логіку тестування
    // і починатись із "should..."
    void shouldCreateAForestWithASpaceForTenAnimals() {
        // тест повинен мати структуру given, when, then

        // given - тут ми створюємо об'єкт для тестування
        Forest forest = new Forest(10);

        // when - ми викликаємо метод, який хочемо протестувати
        // записуємо результат у змінну
        int animalsAmount = forest.getAnimalsAmount();

        // then - тут тестуємо на відповідність актуального значення (яке записали у змінну)
        // та очікуваного, яке передаємо вручну
        Assertions.assertEquals(10, animalsAmount);

        // відформатувати код :
        // mac: option + command + L
        // windows: alt + control + L
    }


    @Test
    void shouldAddANewAnimalToTheForest() throws ForestIsFullException {
        // given
        Forest forest = new Forest(1);

        // when
        forest.addAnimal(new Racoon());
        int animalsAmount = forest.getAnimalsAmount();

        // then
        Assertions.assertEquals(1, animalsAmount);
    }

    @Test
    void shouldNotAddANewAnimalToTheForestIfForestIsFull() throws ForestIsFullException {
        // given
        Forest forest = new Forest(1);
        forest.addAnimal(new Racoon());

        // when & then
        Assertions.assertThrows(ForestIsFullException.class,
                () -> forest.addAnimal(new Racoon()));
    }

    @Test
    void shouldGetFirstAnimal() throws ForestIsFullException {
        // given
        Forest forest = new Forest(1);
        forest.addAnimal(new Cat());

        // when
        Optional<Animal> optionalAnimal = forest.getFirstAnimal();

        // then
        Assertions.assertTrue(optionalAnimal.isPresent());
        Animal animal = optionalAnimal.get();
        Assertions.assertEquals(Cat.class, animal.getClass());
    }

    @Test
    void shouldNotGetFirstAnimalIfThereAreNoAnimalsInTheForest() {
        // given
        Forest forest = new Forest(1);

        // when
        Optional<Animal> optionalAnimal = forest.getFirstAnimal();

        // then
        Assertions.assertTrue(optionalAnimal.isEmpty());
    }

    @Test
    void shouldGetAnimalByAge() throws ForestIsFullException {
        // given
        Racoon racoon = new Racoon();
        racoon.setAge(5);

        Forest forest = new Forest(1);
        forest.addAnimal(racoon);

        // when
        Optional<Animal> optionalAnimal = forest.getAnimalByAge(5);

        // then
        Assertions.assertTrue(optionalAnimal.isPresent());
        Assertions.assertEquals(racoon, optionalAnimal.get());
    }

    @Test
    void shouldNotGetAnimalByAgeIfThereIsNoSuchAnAnimal() throws ForestIsFullException {
        // given
        Racoon racoon = new Racoon();
        racoon.setAge(5);

        Forest forest = new Forest(1);
        forest.addAnimal(racoon);

        // when
        Optional<Animal> optionalAnimal = forest.getAnimalByAge(4);

        // then
        Assertions.assertTrue(optionalAnimal.isEmpty());
    }
}