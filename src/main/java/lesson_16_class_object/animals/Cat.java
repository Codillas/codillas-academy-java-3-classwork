package lesson_16_class_object.animals;

import lesson_16_class_object.food.Fish;
import lesson_16_class_object.fun.Quack;

import java.util.Objects;

public class Cat extends Animal {

    // Додати поля класу: ім’я, вік, вага
    private String name;
    private Breed breed;


    // Створити конструктор без параметрів і додати sout “Викликано конструктор без параметрів”
    public Cat() {
        System.out.println("Викликано конструктор без параметрів");
    }

    // Створити конструктор із параметрами
    public Cat(String name, int age, double weight, Breed breed) {
        System.out.println("Викликано конструктор з параметрами");

        super(weight, age);

        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return this.breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public void voice() {
        System.out.println("Мяуууууу!");
    }

    public void voice(String word) {
        System.out.println("Мяуууууу! " + word);
    }

    public void мурчати(){
        System.out.println("Мурррррррр");
    }

    public Quack eat(Fish fish) {
        System.out.println("Дякую! Я поїв рибу типу: " + fish.getType());

        Quack quack = new Quack("Рибний");
        return quack;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + super.getAge() +
                ", weight=" + super.getWeight() +
                ", breed=" + breed +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Cat)) {
            return false;
        }

        Cat otherCat = (Cat) obj;

        return this.name.equals(otherCat.name)
                && super.getAge() == otherCat.getAge()
                && super.getWeight() == otherCat.getWeight()
                && this.breed == otherCat.breed;
    }

    @Override
    public int hashCode() {
        int age = super.getAge();
        int weight = (int) super.getWeight();
        int name = Objects.hash(this.name);
        int breed = Objects.hash(this.breed);

        return 31 * (age + weight + name + breed);
    }




}
