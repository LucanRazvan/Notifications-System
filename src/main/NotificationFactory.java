package main;

public class NotificationFactory {
    public enum Type { EMAIL, SMS }

    public static NotificationSender createSender(Type type, MessageFormatter formatter) {
        switch (type) {
            case EMAIL:
                return new EmailSender(formatter);
            case SMS:
                return new SmsSender(formatter);
            default:
                throw new IllegalArgumentException("Tip necunoscut: " + type);
        }
    }
}
