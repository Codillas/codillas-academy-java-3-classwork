package lesson_37_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.SequencedCollection;

public class Main {
    static void main() {

        String testStr;

        MyList<String, Integer> myList = new MyList<>();

        try {
            myList.readFile("Test.txt");
        } catch (MyCheckedException e) {
            System.out.println("PAMILKA!");
        }

        Integer[] array1 = new Integer[3];

        String[] array2 = new String[5];

        Character[] array3 = new Character[4];

        Boolean[] array4 = new Boolean[5];

        printArray(array4);

        MyList<Boolean, Integer> list = new MyList<>();
    }

    static <T> void printArray(T[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            T element = array[i];

            boolean isLastElement = i == (array.length - 1);

            String separator = ", ";

            if (isLastElement) {
                separator = "";
            }

            System.out.print(element + separator);
        }

        System.out.print("]\n");
    }

}