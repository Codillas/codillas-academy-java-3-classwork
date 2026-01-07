import lesson_35_collections.WordUtils;

void main() {
    WordUtils wordUtils = new WordUtils();

    List<String> words = new ArrayList<>();

    // The Mykola ate an apple
    words.add("The");
    words.add("Mykola");
    words.add("ate");
    words.add("an");
    words.add("apple");

    String shortestWord =
            wordUtils.getShortestWord(words);

    System.out.println("Shortest word: " + shortestWord);

    String sentence = "Mykola ate a cucumber and a tomato and a carrot ";

    Set<String> uniqueWords = wordUtils.getUniqueWordsFromSentence(sentence);

    System.out.println(uniqueWords);
    // uniqueWords -> "Mykola", "ate", "a", "cucumber", "and", "tomato", "carrot" (in any order)

    String sentence2 = "Today was a very great day and a very nice weather and I was very happy";
    Set<String> duplicatedWords = wordUtils.getDuplicatedWordsFromSentence(sentence2);

    System.out.println(duplicatedWords);

    String sentence3 = "Today was a very great day and a very nice weather and I was very happy";
    Map<String, Integer> wordsCounts = wordUtils.getWordsCount(sentence3);
    System.out.println(wordsCounts);
    // Порахувати скільки разів кожне слово повторюється у реченні

    /*
    {
        "Today" -> 1
        "was"   -> 2
        "a"     -> 2
        "very"  -> 3
        "great" -> 1
        "day"   -> 1
        "and"   -> 2
        "nice"  -> 1
        "I"     -> 1
        "happy" -> 1
    }
    */
}