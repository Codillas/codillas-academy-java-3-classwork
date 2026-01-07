package lesson_40_comparing.animal;

import lombok.Getter;

@Getter
public class Monkey extends Mammal implements Comparable<Animal> {

    public Monkey(
            String name,
            int age,
            double weight,
            double milkPerYearInLiters
    ) {
        super(name, age, weight, milkPerYearInLiters);
    }
}
