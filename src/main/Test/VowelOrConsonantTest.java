import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class VowelOrConsonantTest {


    @Test

    public void TestforVowel(){

        main.java.VowelOrConsonant test=new main.java.VowelOrConsonant();
        String s="VowelConsonentConsonent";

        assertEquals(s,test.CheckForVowel("abc"));

    }

}
