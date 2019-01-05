import main.java.CheckPalindrome;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CheckPalindromeTest {


    @Test

    public void Testforpalindrome(){

        main.java.CheckPalindrome test = new CheckPalindrome();
        long expectedValue=1234321;
        long actualValue = test.palindromeTrue(1234321);
        assertEquals(expectedValue,actualValue);
    }

    @Test

    public void TestForSum(){
        main.java.CheckPalindrome test = new CheckPalindrome();

        long expectedValue=32;
        long actualValue=test.CheckSum(2468642);
        assertEquals(expectedValue,actualValue);



    }
}