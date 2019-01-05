import main.java.StringReverse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class StringReverseTest {

    @Test

    public void CheckReverse(){

        main.java.StringReverse test = new StringReverse();
        assertEquals("ecaps",test.ReverseString("space"));

    }

}