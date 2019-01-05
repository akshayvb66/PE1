import main.java.GuessTheNumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class GuessTheNumberTest {



    @Test

    public void numberCheck()
    {

        GuessTheNumber test = new GuessTheNumber();

        String expectedValue="Number guessed is less than original number";


        String result=test.guessTheNumber(28);

        assertEquals(expectedValue,result);

    }
}
