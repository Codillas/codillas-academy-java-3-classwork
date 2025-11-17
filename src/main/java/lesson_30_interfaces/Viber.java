package lesson_30_interfaces;

public class Viber implements Messenger, Ad {

    @Override
    public void showAd(String text) {
        System.out.println("🟪 Ad from Viber 🤡" + text);
    }

    @Override
    public boolean sendMessage(String message) {
        if (message == null) {
            System.out.println("🟪 Not able to send an empty message.");
            return false;
        }

        System.out.println("🟪 Viber sendMessage: " + message);
        return true;
    }

    @Override
    public void readMessage(String message) {
        System.out.println("🟪Viber readMessage: " + message);
    }
}
