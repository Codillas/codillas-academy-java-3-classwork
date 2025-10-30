package lesson_15_math;

public class MyMath {

    // мін з двох чисел
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }


    // макс з двох чисел
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // абсолютне значення числа
    public static double abs(double a) {
        if (a < 0) {
            a = a * (-1);
            return a;
        } else {
            return a;
        }

    }

    // піднесення до степеня
    public static int power(int a, int power){
        int result = 1;

        for (int i = 1; i <= power; i++){
           result = result * a;
         }

        return result;
    }


    // округлення до цілої частини
    public static int round (double a){
        // 4.3 -> 4
        // 4.7 -> 4
        int result = (int) a;
        return result;
    }

    public static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int getFactorialRecursive(int n) {
        if (n == 1) { // Задаємо умову виходу з рекурсії при досягненні 1
            return 1;
        }
        else {
            // Якщо аргумент не 1, то множимо поточне значення на результат виконання
            // наступного заходу у цей метод (куди ми посилаємо поточне значення - 1)
            return n * getFactorialRecursive(n - 1);
        }
    } // –> 3 * 2 * 1 = 6

}
