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
}