package lesson_20_lombok;

public class Main {

    static void main() {

        Employee employee = new Employee("Vasyl", 50_000, 1);

        Employee employee2 = new Employee();

        System.out.println(employee.isJunior());
        System.out.println(employee.getBonus());

    }
}
