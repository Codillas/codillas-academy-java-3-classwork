package lesson_37_generics;

import java.util.SequencedCollection;

public class MyList<E, T> {
    private E elementE;
    public T elementT;

    public E getElementE() {
        return elementE;
    }

    public T getElementT() {
        return elementT;
    }

    public String getSmthNew() {
        String varia = "Smth new";
        return varia;
    }

    public void toAddSmth() {
        add(3);
    }

    private <X> void add(X element) {

    }

    public String readFile(String fileName) throws MyCheckedException {
        throw new MyCheckedException("Message");
    }
}
