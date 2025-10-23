package lesson_13_scanner;

import java.util.Scanner;

public class ScannerAlternative {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число: ");
        String str = scanner.nextLine();

        int a = Integer.parseInt(str);

        System.out.println(a * 10_000);
    }
}
