package lesson_22_tests;

import java.time.LocalDate;

public class Main {

    static void main() {

        Woman woman = new Woman("Sydney", LocalDate.of(2025, 11, 3), 999);

        System.out.println(woman.isHappy());

    }
}
