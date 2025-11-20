package lesson_32_exceptions;

public class MyMath {

    public static int divide(int a, int b) throws DivisionByZeroException {

        if (b == 0) {
            throw new DivisionByZeroException("divide by zero");
        }

        return a / b;
    }
}
