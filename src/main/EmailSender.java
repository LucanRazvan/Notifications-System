package main;

public class EmailSender implements NotificationSender{
    private MessageFormatter formatter;

    public EmailSender(MessageFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public void send(String recipient, String message) {
        String formatted = formatter.format(message);
        System.out.println("Trimitem EMAIL către " + recipient + ": " + formatted);
    }

}
