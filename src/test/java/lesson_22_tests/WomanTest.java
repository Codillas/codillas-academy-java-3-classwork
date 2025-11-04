package lesson_22_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


class WomanTest {

    private static Woman woman;

    @BeforeAll
    static void setUp() {
        System.out.println("set up");

        woman = new Woman();
        woman.setName("Sydney");
    }

    @Test
    void shouldBeHappy_if_ManicureIsFresh_and_balanceIs1000OrMore() {
        // given
        woman.setLastManicureDate(LocalDate.of(2025, 11, 3));
        woman.setBalanceForBeautyServices(1000);

        // when
        boolean happy = woman.isHappy();

        // then
        Assertions.assertTrue(happy);
    }

    @Test
    void shouldNotBeHappy_if_ManicureIsFresh_but_balanceIsBelow1000() {
        // given
        woman.setLastManicureDate(LocalDate.of(2025, 11, 3));
        woman.setBalanceForBeautyServices(999);

        // when
        boolean happy = woman.isHappy();

        // then
        Assertions.assertFalse(happy);
    }

    @Test
    void shouldNotBeHappy_if_ManicureIsNotFresh_and_balanceIs1000OrMore() {
        // given
        Woman woman = new Woman("Sydney", LocalDate.of(2025, 10, 3), 1500);

        // when
        boolean happy = woman.isHappy();

        // then
        Assertions.assertFalse(happy);
    }

    @Test
    void shouldNotBeHappy_if_ManicureIsNotFresh_and_balanceIsBelow1000() {
        // given
        Woman woman = new Woman("Sydney", LocalDate.of(2025, 10, 3), 900);

        // when
        boolean happy = woman.isHappy();

        // then
        Assertions.assertFalse(happy);
    }

}