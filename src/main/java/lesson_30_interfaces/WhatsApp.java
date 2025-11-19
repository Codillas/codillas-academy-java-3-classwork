package lesson_30_interfaces;

public class WhatsApp implements Messenger {
    @Override
    public boolean sendMessage(String message) {
        if (message == null) {
            System.out.println("🟩 Not able to send an empty message.");
            return false;
        }

        System.out.println("🟩 WhatsApp sendMessage: " + message);
        return true;
    }

    @Override
    public void readMessage(String message) {
        System.out.println("🟩 WhatsApp readMessage: " + message);
    }
}
