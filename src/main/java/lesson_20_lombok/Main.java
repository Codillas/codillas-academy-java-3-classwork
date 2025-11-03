package lesson_20_lombok;

import java.time.LocalDate;

public class Main {

    static void main() {

        LocalDate dateOfBirth = LocalDate.of(1997, 4, 13);

        Employee employee = new Employee("Vasyl", 50_000, 1, dateOfBirth);

        Employee employee2 = new Employee();

        System.out.println(employee.isJunior());
        System.out.println(employee.getBonus());
    }
}
