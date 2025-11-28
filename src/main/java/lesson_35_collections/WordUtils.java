package lesson_35_collections;

import java.util.*;

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

    public Set<String> getDuplicatedWordsFromSentence(String sentence) {
        // Today was a very great day and a very nice weather and I was very happy

        String[] words = sentence.split(" ");

        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicatedWords = new HashSet<>();

        for (String word : words) {
            // boolean isNotDuplicate = uniqueWords.add(word); // (IS NOT A DUPLICATE)
            // NOT (IS NOT A DUPLICATE)
            // НЕ Є (НЕ Є ДУПЛІКАТ) -> Є ДУПЛІКАТ
            // ! -> (НЕ Є)

            // isNotDuplicate -> НЕ Є ДУПЛІКАТ
            // !isNotDuplicate -> (НЕ Є) (НЕ Є ДУПЛІКАТ) -> ДУПЛІКАТ -> isDuplicate

            boolean isDuplicate = !uniqueWords.add(word);

            // boolean isDuplicate = !( uniqueWords.add(word) /* TRUE or FALSE */ ); /* FALSE or TRUE */
            // result is TRUE when word is NOT a duplicate
            // result is FALSE when word is a duplicate

            if (isDuplicate) {
                duplicatedWords.add(word);
            }
        }

        return duplicatedWords;

//        Set<String> duplicatedWords = new HashSet<>();
//
//        for (int currentWordIndex = 0; currentWordIndex < words.length; currentWordIndex++) {
//            String currentWord = words[currentWordIndex];
//
//            // currentWordIndex 0: currentWord = "Today"
//            // currentWordIndex 1: currentWord = "was"
//            // ...
//            // currentWordIndex 15: currentWord = "happy"
//
//            for (int anotherWordIndex = 0; anotherWordIndex < words.length; anotherWordIndex++) {
//                String anotherWord = words[anotherWordIndex];
//
//                // anotherWordIndex 0: anotherWord = "Today"
//                // anotherWordIndex 1: anotherWord = "was"
//                // ...
//                // anotherWordIndex 15: anotherWord = "happy"
//
//                if (anotherWordIndex == currentWordIndex) {
//                    continue;
//                }
//
//                if (currentWord.equals(anotherWord)) {
//                    duplicatedWords.add(currentWord);
//                }
//            }
//        }
//
//        return duplicatedWords;
    }

    // K -> V
    // word -> count
    public Map<String, Integer> getWordsCount(String sentence) {
        // Today was a very great day and a very nice weather and I was very happy

        Map<String, Integer> wordsCount = new HashMap<>(); // {}

        String[] words = sentence.split(" ");


        for (String word : words) {

            boolean wordsCountContainsWord = wordsCount.containsKey(word);

            int currentCount = 0;

            if (wordsCountContainsWord) {
                currentCount = wordsCount.get(word);
            }

            int newWordCount = currentCount + 1;

            wordsCount.put(word, newWordCount);

            // Iteration 0 -> word = "Today"
            // wordsCount = {}

            // Iteration 1 -> word = "Today"
            // wordsCount = {"Today" : 1 }

            // int currentWordCount = wordsCount.getOrDefault(word, 0);

            // int newWordCount = currentWordCount + 1;

            // wordsCount.put(word, newWordCount);
        }

        return wordsCount;
    }
}
