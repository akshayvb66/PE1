import main.java.RepeatLastChar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class RepeatLastCharTest {

    @Test

    public void TestForLoop(){

        main.java.RepeatLastChar test=new RepeatLastChar();

        assertEquals("akshayayay",test.repeatLast("akshay",2));

    }


}
