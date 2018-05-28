package main.test.exercises;

import main.java.exercises.Factorial;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorial() {
        Assert.assertEquals(6, Factorial.calculateFactorial(3));
        Assert.assertEquals(24, Factorial.calculateFactorial(4));
        Assert.assertEquals(120, Factorial.calculateFactorial(5));
        Assert.assertEquals(5040, Factorial.calculateFactorial(7));
    }
}
