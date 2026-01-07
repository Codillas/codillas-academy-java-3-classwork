package lesson_40_comparing;

import lesson_40_comparing.animal.Animal;
import lesson_40_comparing.animal.Lion;
import lesson_40_comparing.animal.Monkey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static void main() {

        List<Animal> animals = new ArrayList<>();

        Monkey monkeyPeter = new Monkey("Peter", 42, 32.5, 0);
        Monkey monkeySamanta = new Monkey("Samanta", 25, 32.0, 10);
        Lion lionHans = new Lion("Hans", 12, 85.5, 0, 5);
        Lion lionMichaela = new Lion("Michaela", 26, 25.0, 5, 5);

        // 25.5 <=> 32.0 => -1
        int result1 = lionHans.compareTo(monkeySamanta);
        // 32.0 <=> 25.5 => 1
        int result2 = monkeySamanta.compareTo(lionHans);

        System.out.println(result1);
        System.out.println(result2);

        animals.add(monkeyPeter);
        animals.add(monkeySamanta);
        animals.add(lionHans);
        animals.add(lionMichaela);

        // Michaela -> Samanta -> Peter -> Hans
        Collections.sort(animals);

        System.out.println("Natural sorting by weight -> " + animals);

        Collections.sort(animals, (animal1, animal2) ->
                Integer.compare(animal1.getAge(), animal2.getAge()));

        System.out.println("Sorting by age -> " + animals);

        Driver leclerc = new Driver("Leclerc", 405, 23);
        Driver norris = new Driver("Norris", 408, 28);
        Driver verstappen = new Driver("Verstappen", 396, 30);

        List<Driver> drivers = new ArrayList<>();
        drivers.add(leclerc);
        drivers.add(norris);
        drivers.add(verstappen);

        System.out.println(drivers);

        // Collections.sort(drivers);
        // Collections.sort(drivers, (a, b) -> b.compareTo(a));
        Collections.sort(drivers, Collections.reverseOrder());

        System.out.println(drivers);

        Collections.sort(drivers, new DriverAgeComparator());
        System.out.println(drivers);

        //  ad-hoc comparator implementation
        Collections.sort(drivers, (a, b) -> Integer.compare(a.getAge(), b.getAge()));
    }
}
