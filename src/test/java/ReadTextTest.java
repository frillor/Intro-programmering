import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class ReadTextTest {

    @Test
    public void countTextTest(){
        assertEquals(100,ReadTextMain.countText());
    }
    @Test
    public void countLineNotNull(){
        assertNotNull(String.valueOf(3),ReadTextMain.countLineText());
    }
    @Test
    public void stopTrue(){
        boolean stop = ReadTextMain.stop() ;
        assertTrue(stop);
    }

}
