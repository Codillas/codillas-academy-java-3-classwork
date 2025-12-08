package lesson_40_comparing.animal;

import lombok.Getter;

@Getter
public class Lion extends Mammal {

    private final double maneLengthInCm;

    public Lion(
            String name,
            int age,
            double weight,
            double milkPerYearInLiters,
            double maneLengthInCm
    ) {
        super(name, age, weight, milkPerYearInLiters);
        this.maneLengthInCm = maneLengthInCm;
    }
}
