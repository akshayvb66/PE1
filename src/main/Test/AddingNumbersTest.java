import main.java.AddingNumbers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class AddingNumbersTest {

    @Before
    public void setUp() throws Exception {
        main.java.AddingNumbers test = new main.java.AddingNumbers();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test

    public void AdditionTesting(){

        main.java.AddingNumbers test = new main.java.AddingNumbers();

        int[] myIntArray = {1,2,3,4,5};
        int actualValue = test.SumOfNumbers(myIntArray);
        assertEquals(15,actualValue);
    }
}
