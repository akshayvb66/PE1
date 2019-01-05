import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class LoopsTillNthTest {

    @Test

    public void TestForLoop(){

        main.java.LoopsTillNth test = new main.java.LoopsTillNth();


        assertEquals("1 2 2 3 3 3 ",test.LoopTillN(3));

    }
}
