package cs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    @Test
    public void test() {
        long startTime = System.currentTimeMillis();
        Assert.assertEquals(10, App.f(10));
        long endTime = System.currentTimeMillis();
        long executionTime = startTime - endTime;
        Assert.assertTrue(executionTime < 1000);
    }


}
