import main.java.NumTomJerry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)

public class NumTomJerryTest {


    @Test

    public void test() {

        NumTomJerry test = new NumTomJerry();
        String result = test.NumTomJerry(23);

    assertEquals("Tom",result);




    }


}
