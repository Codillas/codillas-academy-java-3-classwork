package lesson_23_strings_and_puzzles;

public class Main {
    static void main() {

        boolean result = Puzzle.isPalindrome(10);
        System.out.println(result);

        int [] arr = {2, 3, 3};
        int majorityElement = Puzzle.majorityElement(arr);
        System.out.println(majorityElement);

        String dirtyString = "A man, a plan, a canal: Panama";
        String cleanString = dirtyString.replaceAll("[^A-Za-z0-9]", "");
        String lowerCaseString = cleanString.toLowerCase();
        System.out.println(lowerCaseString);
    }
}
