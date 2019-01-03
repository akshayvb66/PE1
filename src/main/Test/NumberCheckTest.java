import main.java.NumberCheck;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)

public class NumberCheckTest {


    @Test

    public void test() {

        NumberCheck test = new NumberCheck();
        String result = test.NumTomJerry(23);

    assertEquals("Tom",result);




    }


}
