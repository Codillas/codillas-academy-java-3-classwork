package lesson_40_comparing;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Driver implements Comparable<Driver> {

    private String name;
    private int points;
    private int age;

    @Override
    public int compareTo(Driver otherDriver) {

        if (this.points == otherDriver.points) {
            return Integer.compare(this.age, otherDriver.age);
        } else if (this.points < otherDriver.points) {
            return -1;
        }
        return 1;
    }
}
