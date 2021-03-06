import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AdditionTest {
    private Addition addition;

    @Before
    public void setup() {
        addition = new Addition();
    }

    @Test
    public void canaryTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void testTheSumWithTwoInts() {
        Assert.assertEquals(addition.sum(10,20),30);
        Assert.assertEquals(addition.sum(15,23),38);
    }

    @Test
    public void testTheSumWithTwoLists() {
        Assert.assertEquals(addition.sum(Arrays.asList(1, 2),Arrays.asList(3, 4)),Arrays.asList(1, 2, 3, 4));
        Assert.assertEquals(addition.sum(Arrays.asList(7, 5, 5), Arrays.asList(7, 5, 5)), Arrays.asList(7,5,5,7,5,5));
    }

    @Test
    public void testTheSumWithTwoStrings() {
        String result = addition.sum("abc", "def");
        Assert.assertEquals(result,"abcdef");
    }
    @Test (expected = ArithmeticException.class)
    public  void testException() {
        addition.methodExc();
    }


}