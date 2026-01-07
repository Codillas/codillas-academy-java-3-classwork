package lesson_38_lambda;

public class Calculator {

    public double performOperationOn(int x, int y, Operationable operationable) {
        return operationable.calculate(x, y);
    }

}
