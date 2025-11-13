package lesson_16_class_object.animals;

public class Fox extends Animal{

    private boolean rabies;

    public Fox() {
    }

    public Fox(double weight, int age, boolean rabies) {
        super(weight, age);
        this.rabies = rabies;
    }

    @Override
    public void voice() {
        System.out.println("Тритититититиририри!");

        if (rabies) {
            System.out.println("Я скажена! Обережно!");
        } else {
            System.out.println("Підходь, не бійся, дай печиво!");
        }
    }

    public boolean isRabies() {
        return rabies;
    }

    public void setRabies(boolean rabies) {
        this.rabies = rabies;
    }
}
