package lesson_39_functional_interface;

import java.util.function.BinaryOperator;

public class Main {
    static void main() {
        // який із чисел a і b робить число ab
        // -> (20, 50 -> 2050)
        // -> (40, 10 -> 4010)

        BinaryOperator<Long> glueNumbersOperator = (a, b) -> {

            String aAsString = a.toString(); // "20"
            String bAsString = b.toString(); // "50"

            String resultAsString = aAsString + bAsString; // "2050"

            return Long.parseLong(resultAsString); // 2050 (as long)
        };

        BinaryOperator<Long> glueNumbersOperatorShort = (a, b) ->
                Long.parseLong(a.toString() + b.toString());

        long result = glueNumbersOperatorShort.apply(12L, 34L);

        System.out.println("Result -> " + result);
    }
}
