package lesson_35_collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordUtils {
    public String getShortestWord(List<String> words) {
        // words = "The", "Mykola", "ate", "an", "apple"
        // words.size() = 5

        int shortestWordLength = 999999999; // shortestWordLength = 999999999
        String shortestWord = ""; // shortestWord = ""

        for (String word : words) {
            // ==> Iteration 1
            // word = "The"
            // wordLength = 3
            // if (3 < 999999999) { => true
            //      shortestWordLength = 3
            //      shortestWord = "The"
            // }

            // ==> Iteration 2
            // word = "Mykola"
            // wordLength = 6
            // if (6 < 3) { => false
            // if ide na ***

            // ==> Iteration 3
            // word = "ate"
            // wordLength = 3
            // if (3 < 3) { => false
            // if ide na ***

            // ==> Iteration 4
            // word = "an"
            // wordLength = 2
            // if (2 < 3) { => true
            //      shortestWordLength = 2;
            //      shortestWord = "an";
            // }

            // ==> Iteration 5
            // word = "apple"
            // wordLength = 5
            // if (5 < 2) { => false
            // if ide na ***

            int wordLength = word.length();

            if (wordLength < shortestWordLength) {
                shortestWordLength = wordLength;
                shortestWord = word;
            }
        }

        // shortestWord = "an"
        return shortestWord;
    }

    public Set<String> getUniqueWordsFromSentence(String sentence) {
        // "Mykola ate a cucumber and a tomato and a carrot"


        String[] words = sentence.split(" ");

        return new HashSet<>(List.of(words));

        // polymorphism = [HashSet is a Set] ALSO [TreeSet is a Set]

//        String currentWord = "";
//
//        for (int i = 0; i < sentence.length(); i++) {
//            char character = sentence.charAt(i);
//
//            if (character == ' ') {
//                // currentWord = "Mykola"
//
//                uniqueWords.add(currentWord);
//
//                currentWord = "";
//
//                continue;
//            }
//
//            // "" + ' ' -> " "
//            currentWord += character;
//        }
//
//        // currentWord = "carrot"
//
//        uniqueWords.add(currentWord);
//
//        return uniqueWords;
    }
}
