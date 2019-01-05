import main.java.CharacterType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CharacterTypeTest {

    @Test

    public void TestForCapital(){

        main.java.CharacterType test = new main.java.CharacterType();

        String result = test.CapitalOrSmall('-');

        assertEquals("special",result);

    }

}
