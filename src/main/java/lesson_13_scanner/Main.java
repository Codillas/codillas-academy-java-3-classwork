package lesson_13_scanner;

import java.util.Scanner;

public class Main {

    static void main() {
        // створити об'єкт типу сканер
        Scanner scanner = new Scanner(System.in);

        // дати підказку користувачу
        System.out.println("Введіть число: ");

        // зчитати число з консолі та записати у змінну
        int inputValue = scanner.nextInt();

        // показати користувачу що він/вона ввели
        System.out.println("Ви ввели число: " + inputValue);

        // введіть слово
        System.out.println("Тепер введіть слово");
        String str =  scanner.next();

        // покажемо користувачу слово яке він ввів
        System.out.println("Ви ввели слово: " + str);

        // зчитати речення
        System.out.println("Тепер введіть речення");

        // костиль - підчищаємо все що в буфері (у нас там '\n')
        scanner.nextLine();

        String sentence = scanner.nextLine();

        // покажемо користувачу речення яке він ввів
        System.out.println("Ви ввели речення: " + sentence);

        // закрити сканер - вважається гарною практикою
        scanner.close();
    }
}
