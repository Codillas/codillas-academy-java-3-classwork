package lesson_16_class_object.animals;

public class Cat {

    // Додати поля класу: ім’я, вік, вага
    private String name;
    private int age;
    private double weight;


    // Створити конструктор без параметрів і додати sout “Викликано конструктор без параметрів”
    public Cat() {
        System.out.println("Викликано конструктор без параметрів");
    }

    // Створити конструктор із параметрами
    public Cat(String name, int age, double weight) {
        System.out.println("Викликано конструктор з параметрами");

        this.name = name;
        this.age = age;
        this.weight = weight;
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

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
