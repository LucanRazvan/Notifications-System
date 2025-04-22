package main;

public class SmsSender implements NotificationSender {
    private MessageFormatter formatter;

    public SmsSender(MessageFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public void send(String recipient, String message) {
        String formatted = formatter.format(message);
        System.out.println("Trimitem SMS către " + recipient + ": " + formatted);
    }
}
