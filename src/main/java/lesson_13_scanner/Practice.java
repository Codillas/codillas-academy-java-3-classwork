package lesson_13_scanner;

import java.util.Scanner;

public class Practice {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // Зчитати з клавіатури два числа: кількість рядків m і кількість стовпців n.
        System.out.println("Введіть кількість рядків:");
        int m = scanner.nextInt();
        System.out.println("Введіть кількість стовбців:");
        int n = scanner.nextInt();

        // Створити двовимірний масив (матрицю) розміром m x n.
        int[][] matrix = new int[m][n];

        // {
        //   {0, 1, 2},
        //   {3, 4, 5},
        //   {6, 7, 8}
        // }

        // Заповнити матрицю числами, що вводить користувач.
        System.out.println("Введіть числа, щоб заповнити матрицю.");
        System.out.println("Матриця має вигляд " + m + " на " + n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Давайте заповнимо матрицю елементами");
        for (int i = 0; i < m; i++) {
            System.out.println("Заповни " + (i + 1) + " рядок");
            System.out.println("Введи " + n + " чисел. Після кожного натисни Enter.");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println("Молодець! Перейдемо до наступного рядку.");
        }

        System.out.println("Заповнена матриця: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Cума всіх елментів: " + sum);

        // Вивести на екран усі елементи матриці в табличному вигляді (кожен рядок в окремому рядку).
        // Знайти суму всіх елементів


        scanner.close();
    }
}
