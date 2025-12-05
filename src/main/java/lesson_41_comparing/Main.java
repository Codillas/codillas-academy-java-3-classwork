package lesson_41_comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static void main() {
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
