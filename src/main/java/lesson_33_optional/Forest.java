package lesson_33_optional;

import lesson_16_class_object.animals.Animal;

// клікнути на назву класа і натиснути
// macOS: option + Enter
// windows: alt + Enter
// потім натиснути create test
public class Forest {

    private Animal[] animals;

    public Forest(int animalsAmount) {
        this.animals = new Animal[animalsAmount];
    }

    public int getAnimalsAmount() {
        return this.animals.length;
    }


}
