package lesson_11_switch;

public class Main {

    static void main() {

        char a = 'a';
        System.out.println(a);
        System.out.println(Character.toUpperCase(a));

        int number = 2;

        if (number == 1) {
            System.out.println("Понеділок");
        } else if (number == 2) {
            System.out.println("Вівторок");
        } else if (number == 3) {
            System.out.println("Середа");
        } else if (number == 4) {
            System.out.println("Четвер");
        } else if (number == 5) {
            System.out.println("П'ятниця");
        } else if (number == 6 || number == 7) {
            System.out.println("Вихідні!!!");
        } else {
            System.out.println("Немаэ такого тижня");
        }

        switch (number) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("П'ятниця");
                break;
            case 6:
            case 7:
                System.out.println("Вихідні!!!");
                break;
            default:
                System.out.println("Немає такого тижня");
        }

        String dayOfTheWeek = switch (number) {
            case 1 -> "Понеділок";
            case 2 -> "Вівторок";
            case 3 -> "Середа";
            case 4 -> "Четвер";
            case 5 -> "П'ятниця";
            case 6, 7 -> "Вихідні!!!";
            default -> "Немає такого тижня";
        };

        System.out.println(dayOfTheWeek);

    }
}
