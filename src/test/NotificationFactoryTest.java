package test;
import main.*;
import static org.junit.jupiter.api.Assertions.*;
public class NotificationFactoryTest {
    @org.junit.Test
    public void testCreateEmailSender() {
        NotificationSender sender = NotificationFactory.createSender(NotificationFactory.Type.EMAIL, new PlainTextFormatter());
        assertInstanceOf(EmailSender.class, sender);
    }

    @org.junit.Test
    public void testCreateSmsSender() {
        NotificationSender sender = NotificationFactory.createSender(NotificationFactory.Type.SMS, new PlainTextFormatter());
        assertInstanceOf(SmsSender.class, sender);
    }
}
