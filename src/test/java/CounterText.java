
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class CounterText {

    WordCounter text = new WordCounter();


    @Test
    public void countWordTextTest() {
        assertEquals(6, text.getNumberCharacter("Hello stop"));
    }

    @Test
    public void countLineNotNullTest() {
        assertNotNull(text.getNumberRad("text"));
    }

    @Test
    public void countLineTest() {
        assertSame(1, text.getNumberRad("text"));
    }

    @Test
    public void stopTest() {
        boolean stop = text.containsStop("stop");
        assertTrue(stop);
    }
}