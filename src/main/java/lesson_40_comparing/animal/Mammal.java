package lesson_40_comparing.animal;

import lombok.Getter;

@Getter
public abstract class Mammal extends Animal {
    private final double milkPerYearInLiters;

    public Mammal(
            String name,
            int age,
            double weight,
            double milkPerYearInLiters
    ) {
        super(name, age, weight);
        this.milkPerYearInLiters = milkPerYearInLiters;
    }

    @Override
    public String toString() {
        return String.format(
                "[name: %s, age: %d, weight: %.2f]",
                this.getName(), this.getAge(), this.getWeight());
    }
}
