package lesson_38_lambda;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Main {
    static void main() {

        // Variant 1
        Operation operation1 = new Operation();

        // Variant 2
        Operationable operation2 = new Operation();

        // We create object of functional interface Operationable
        // via anonymous class
        Operationable operation3 = new Operationable() {
            @Override
            public double calculate(int x, int y) {
                return x * y;
            }
        };

        Operationable operation4 = (x, y) -> {
            return x - y;
        };

        Operationable operation5 = (x, y) -> (double) x / y;

        double result = operation5.calculate(2, 3);

        System.out.println(result);

        Calculator calculator = new Calculator();

        Operationable multiplyOperation = (x, y) -> x * y;

        double operationResult = calculator.performOperationOn(3, 5, (x, y) -> x * y);

        System.out.println("Operation Result -> " + operationResult);

        BinaryOperator<Integer> multipleValues = (x, y) -> x * y;

        System.out.println(multipleValues.apply(5, 6));
    }
}
