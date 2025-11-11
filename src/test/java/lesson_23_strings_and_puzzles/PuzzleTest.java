package lesson_23_strings_and_puzzles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PuzzleTest {

    @Test
    void shouldRemoveElementsFromArray() {
        // given
        int[] arr = {3, 2, 2, 3};
        int[] expectedArr = {2, 2};

        // when
        int[] result = Puzzle.removeElement(arr, 3);

        // then
        Assertions.assertArrayEquals(expectedArr, result);
    }

    @Test
    void shouldReturnMaxProfit() {
        // given
        int[] arr = {7,1,5,3,6,4};

        // when
        int maxProfit = Puzzle.maxProfit(arr);

        // then
        Assertions.assertEquals(5, maxProfit);
    }

    @Test
    void shouldReturnMaxProfitZero() {
        // given
        int[] arr = {7,6,4,3,1};

        // when
        int maxProfit = Puzzle.maxProfit(arr);

        // then
        Assertions.assertEquals(0, maxProfit);
    }

}