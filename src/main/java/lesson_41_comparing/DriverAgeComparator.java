package lesson_41_comparing;

import java.util.Comparator;

public class DriverAgeComparator implements Comparator<Driver> {

    @Override
    public int compare(Driver firstDriver, Driver secondDriver) {
        return Integer.compare(firstDriver.getAge(), secondDriver.getAge());
    }
}
