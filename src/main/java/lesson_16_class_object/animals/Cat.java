package lesson_16_class_object.animals;

import lesson_16_class_object.food.Fish;
import lesson_16_class_object.fun.Quack;

import java.util.Objects;

public class Cat {

    // Додати поля класу: ім’я, вік, вага
    private String name;
    private int age;
    private double weight;
    private Breed breed;


    // Створити конструктор без параметрів і додати sout “Викликано конструктор без параметрів”
    public Cat() {
        System.out.println("Викликано конструктор без параметрів");
    }

    // Створити конструктор із параметрами
    public Cat(String name, int age, double weight, Breed breed) {
        System.out.println("Викликано конструктор з параметрами");

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Breed getBreed() {
        return this.breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void voice() {
        System.out.println("Мяуууууу!");
    }

    public void voice(String word) {
        System.out.println("Мяуууууу! " + word);
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
                ", age=" + age +
                ", weight=" + weight +
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
                && this.age == otherCat.age
                && this.weight == otherCat.weight
                && this.breed == otherCat.breed;
    }

    @Override
    public int hashCode() {
        int age = this.age;
        int weight = (int) this.weight;
        int name = Objects.hash(this.name);
        int breed = Objects.hash(this.breed);

        return 31 * (age + weight + name + breed);
    }


}
