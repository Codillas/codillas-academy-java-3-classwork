package lesson_30_interfaces;

public class Main {

    static void main() {
        // WhatsApp (Messenger)
        WhatsApp whatsApp = new WhatsApp();

        boolean result1 = whatsApp.sendMessage("Hello World!");
        System.out.println("Message delivery status:" + result1);

        boolean result2 = whatsApp.sendMessage(null);
        System.out.println("Message delivery status:" + result2);

        whatsApp.readMessage("Привіт!");

        // Viber (Messenger, Ad)
        Viber viber = new Viber();
        viber.showAd("Temu screen cover 2 cents only promo!!!");

        viber.sendMessage("Привіт дід!");
        viber.showDefaultAd();
    }
}
