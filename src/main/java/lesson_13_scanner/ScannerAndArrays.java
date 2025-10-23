package lesson_13_scanner;

import java.util.Scanner;

public class ScannerAndArrays {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // З клавіатури зчитати розмір масиву.
        System.out.println("Введіть розмір майбутнього масиву: ");
        int arrayLength = scanner.nextInt();

        // Створити масив цілих чисел розміром arrayLength.
        int [] arr = new int[arrayLength];

        // За допомогою циклу зчитати з клавіатури кожен елемент масиву.
        System.out.println("Введіть усі елементи масиву по черзі. Нажимайте Enter після кожного елементу.");
        System.out.println("Нагадую, що масив буде мати " + arrayLength + " елементів.");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Треба ввести ще " + (arrayLength - i) + " елемент(-ів / -и)");
            arr[i] = scanner.nextInt();
        }

        // виведемо на екран
        System.out.println("Ваш масив має вигляд");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();


        // Вивести:

        //  - Суму всіх елементів масиву.
        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            sum += arr[i];
        }
        System.out.println("Сума всіх елементів масиву: " + sum);

        //  - Мінімальне значення в масиві.
        int minElement = arr[0];
        for (int i = 1; i < arrayLength; i++) {
            if ( arr[i] < minElement){
                minElement = arr[i];
            }
        }
        System.out.println("Мінімальний елемент у масиві: " + minElement);

        scanner.close();
    }
}
