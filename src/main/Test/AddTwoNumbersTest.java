import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)

public class AddTwoNumbersTest {

    @Test

    public void test(){

        AddTwoNumbers test=new AddTwoNumbers();
        int result =test.addNumber(5,6);

        assertEquals(11,result);
    }


}