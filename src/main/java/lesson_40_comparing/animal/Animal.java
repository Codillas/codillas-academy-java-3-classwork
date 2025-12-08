package lesson_40_comparing.animal;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Animal implements Comparable<Animal> {
    private final String name;
    private final int age;
    private final double weight;

    @Override
    public int compareTo(Animal otherAnimal) {
        return Double.compare(this.getWeight(), otherAnimal.getWeight());
    }

    @Override
    public String toString() {
        return "BILEBERDAS";
    }
}
