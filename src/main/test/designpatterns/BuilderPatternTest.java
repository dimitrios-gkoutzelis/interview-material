package main.test.designpatterns;

import main.java.interview.designpatterns.BuilderPattern;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BuilderPatternTest {

    @Test
    public void testBuilderPattern() {
        BuilderPattern.Builder builder = new BuilderPattern.Builder();
        builder.withAge("12").withCity("LA").withCountry("US").withName("George");
        BuilderPattern p = builder.build();

        assertNotNull(p);
        assertEquals("US", p.getCountry());
    }

    @Test(expected = IllegalStateException.class)
    public void testBuilderPatternFailure() {
        BuilderPattern.Builder builder = new BuilderPattern.Builder();
        builder.build();
    }
}
