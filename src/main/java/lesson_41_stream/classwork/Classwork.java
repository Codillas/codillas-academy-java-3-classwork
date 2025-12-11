package lesson_41_stream.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Classwork {
    static void main() {

        List<Cat> catList = new ArrayList<>();

        Cat snizhok = new Cat("Snizhok", 4, 3.2);
        Cat pyrizhok = new Cat("Pyrizhok", 6, 6.9);
        Cat rozhok = new Cat("Rozhok", 1, 2.5);
        Cat manny = new Cat("Manny", 5, 4.8);
        Cat biznes = new Cat("Biznes", 15, 15.6);

        catList.add(snizhok);
        catList.add(pyrizhok);
        catList.add(rozhok);
        catList.add(manny);
        catList.add(biznes);


        List<Cat> catsOlderThan5yo = catList.stream()
                .filter(cat -> cat.getAge() >= 5)
                .collect(Collectors.toList());

        System.out.println("catsOlderThan5yo -> " + catsOlderThan5yo);

//        List<Cat> catsToList = catList.stream()
//                .filter(cat -> cat.getAge() >= 5)
//                .toList();

        long numberOfCatsHeavierThan4kg = catList.stream()
                .filter(cat -> cat.getWeight() > 4)
                .count();

        System.out.println("numberOfCatsHeavierThan4kg -> " + numberOfCatsHeavierThan4kg);

        List<String> sortedCatNames = catList.stream()
                .sorted((cat1, cat2) -> Integer.compare(cat1.getAge(), cat2.getAge()))
                .map(cat -> cat.getName())
                .collect(Collectors.toList());

        System.out.println(sortedCatNames);

        boolean anyCatYoungerThan1yo = catList.stream()
                .anyMatch(cat -> cat.getAge() <= 1);

        System.out.println("anyCatYoungerThan1yo -> " + anyCatYoungerThan1yo);


        double sumOfCatsWeight = 0; // Initial value
        for (Cat cat : catList) {
            sumOfCatsWeight += cat.getWeight();
        }
        System.out.println("sumOfCatsWeight -> " + sumOfCatsWeight);

        double sumOfCatsWeightStream = catList.stream()
                .map(cat -> cat.getWeight())
                .reduce(0.0, (sumOfCatWeight, catWeight) -> sumOfCatWeight + catWeight);

        System.out.println("sumOfCatsWeightStream -> " + sumOfCatsWeightStream);
    }
}
