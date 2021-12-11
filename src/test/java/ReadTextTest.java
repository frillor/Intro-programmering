import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class ReadTextTest {

    CountWordText text = new CountWordText();
    CountLineText CountText = new CountLineText();
    WordStopText stopWord = new WordStopText();

    @Test
    public void countWordTextTest() {
        assertEquals(100, text.countWordText());
    }

    @Test
    public void countLineNotNullTest() {
        assertNotNull(String.valueOf(3), CountText.countLineText());
    }

    @Test
    public void stopTest() {
        boolean stop = stopWord.stop();
        assertTrue(stop);
    }
}
