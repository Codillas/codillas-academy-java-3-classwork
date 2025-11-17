package lesson_30_interfaces;

public interface Ad {

    void showAd(String text);

    default void showDefaultAd(){
        System.out.println("Default Ad 🤡: bowl for free! 🆓🍲");
    }
}
