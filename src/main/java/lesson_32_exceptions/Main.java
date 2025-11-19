package lesson_32_exceptions;

public class Main {

    static void main () {
        int a = 10;
        int b = 0;

        int result;

        try {
             result = MyMath.divide(a, b);
        } catch (DivisionByZeroException e){
            System.out.println("Виникла помилка при діленні на нуль!");
            System.out.println("Другий аргумент функції повинен != 0");
            System.out.println("Опис помилки: " + e.getMessage());

            result = Integer.MAX_VALUE;
        } finally {
            System.out.println("FINALLY EXECUTES ALWAYS!");
        }


        System.out.println(result);
    }
}
