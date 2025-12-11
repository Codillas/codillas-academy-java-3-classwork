package lesson_41_stream;

import lesson_41_stream.classwork.Cat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    static void main() {

        List<String> namesList = List.of("Alice", "Bob", "Charlie");

        Stream<String> namesStream =
                namesList // List of Strings (names)
                .stream() // Stream Source (return Stream)
                .filter(name -> {
                    System.out.println("Lambda in `filter` got executed");
                    return name.startsWith("A");
                }) // Intermediate Operator (Не виконується зараз)
                .map((name) -> {
                    System.out.println("Lambda in `map` got executed");
                    return name.toUpperCase();
                }); // Intermediate Operator (Не виконується зараз)

        System.out.println("Stream's intermediate operators were not executed yet");

        // Обчислення починається тільки після виклику термінальної операції
        // namesStream.forEach((name) -> System.out.println(name)); // ALICE


        // namesStream.count();

        // String[] namesAsArray = namesStream.toArray(String[]::new);

        // System.out.println(namesAsArray);

        // System.out.println("Any match result = " + Stream.of().anyMatch((a) -> true)); -> false if empty
        // System.out.println("All match result = " + Stream.of().allMatch((a) -> true)); -> true if empty
        // System.out.println("None match result = " + Stream.of().noneMatch((a) -> false)); // -> true if empty
        // noneMatch() = !anyMatch()
    }
}
