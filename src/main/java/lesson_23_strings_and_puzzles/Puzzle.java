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

    public static int [] removeElement(int[] nums, int val) {

        int valueCount = 0;
        // пройтись по масиву
        for (int i = 0; i < nums.length; i++) {
            // і порахувати скільки разів зустрічається val
            if (nums[i] == val) {
                valueCount++;
            }
        }

        // створили новий масив із довжиною nums.length - valueCount
        int delta = nums.length - valueCount;
        int [] result = new int[delta];

        int j = 0;
        // пробігтись по старому, порівняти елементи із val
        for (int i = 0; i < nums.length; i++) {
            // якщо не збігається -> копіюємо в новий масив
            if (nums[i] != val) {
                result[j] = nums[i];
                j++;
            }
        }

        return result;
    }

    public static int maxProfit(int[] arr) {

        // [7,1,5,3,6,4]
        // return 5

        int maxProfit = 0;
        int minPrice = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // перевірити профіт
            int currentProfit = arr[i] - minPrice;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }

            // знайти чи є менша ціна
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }
        }

        return maxProfit;
    }
}
