package test;
import main.*;
import static org.junit.jupiter.api.Assertions.*;
public class MessageFormatterTest {
    @org.junit.Test
    public void testPlainTextFormatter() {
        MessageFormatter fmt = new PlainTextFormatter();
        assertEquals("Text simplu", fmt.format("Text simplu"));
    }

    @org.junit.Test
    public void testHtmlFormatter() {
        MessageFormatter fmt = new HtmlFormatter();
        assertEquals("<html><body>Salut</body></html>", fmt.format("Salut"));
    }
}
