package lesson_33_optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


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

}