import main.java.SortDecreasing;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class SortDecreasingTest

{
@Test

    public void TestSort(){


    {
        main.java.SortDecreasing test = new SortDecreasing();

       String result=test.sortedNum(234534);
        assertEquals("544332",result);
    }

}
}
