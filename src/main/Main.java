package main;

public class Main {
    public static void main(String[] args) {
        MessageFormatter formatter = new HtmlFormatter();
        NotificationSender sender = NotificationFactory.createSender(NotificationFactory.Type.EMAIL, formatter);
        sender.send("utilizator@example.com", "Salut lume!");
    }
}
