package lesson_23_strings_and_puzzles;

public class Puzzle {

    public static boolean isPalindrome(int x) {

        // "121" = 121 : true
        // 10 = 01 : false
        // -121 = 121- : false

        String originalString = String.valueOf(x);

        StringBuilder sb = new StringBuilder(originalString);
        String reversedString = sb.reverse().toString();

        if (originalString.equals(reversedString)) {
            return true;
        } else {
            return false;
        }
    }

    public static int majorityElement(int[] arr) {

        // arr = [2,3,3]
        // majorityElement - це елемент, який зустрічається більше за n/2 разів
        // majorityElement завжди існує

        // алгоритм:

        // йдемо по масиву
        for (int i = 0; i < arr.length; i++) {
            int majorityElement = arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                // рахуємо скільки разів зустрічається цей елемент
                if (arr[j] == majorityElement){
                    count++;
                }
            }
            // якщо більше ніж n/2 разів повертаємо цей елемент
            if (count > arr.length/2) {
                return majorityElement;
            }
        }

        return Integer.MAX_VALUE;
    }
}
