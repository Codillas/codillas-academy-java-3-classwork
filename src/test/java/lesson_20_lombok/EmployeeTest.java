package lesson_20_lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class EmployeeTest {

    @Test
    void shouldBeJunior() {
        // given
        Employee employee = new Employee("Vasyl", 50_000, 1, LocalDate.of(1997, 4, 13));

        // when
        boolean result = employee.isJunior();

        // then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldNotBeJunior() {
        // given
        Employee employee = new Employee("Vasyl", 50_000, 3, LocalDate.of(1997, 4, 13));

        // when
        boolean result = employee.isJunior();

        // then
        Assertions.assertFalse(result);
    }


    @Test
    void shouldReturnTenPercentBonus(){
        // given
        Employee employee = new Employee("Vasyl", 50_000, 3, LocalDate.of(1997, 4, 13));

        // when
        double bonus = employee.getBonus();

        // then
        Assertions.assertEquals(5_000, bonus);
    }

    @Test
    void shouldNotReturnTenPercentBonus_becauseEmployeeDoesNotHaveSalary(){
        // given
        Employee employee = new Employee("Vasyl", 0, 3, LocalDate.of(1997, 4, 13));

        // when
        double bonus = employee.getBonus();

        // then
        Assertions.assertEquals(0, bonus);
    }
}