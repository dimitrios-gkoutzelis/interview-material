package main.test.exercises;
import static org.junit.Assert.*;

import main.java.exercises.ArraysAreSame;
import org.junit.Test;

public class ArraysAreSameTest {

    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, ArraysAreSame.comp(a, b));
        assertEquals(true, ArraysAreSame.comp(new int[]{}, new int[]{}));
        assertEquals(false, ArraysAreSame.comp(new int[]{}, new int[]{1}));
        assertEquals(true, ArraysAreSame.comp(new int[]{2,2,3}, new int[]{4,4,9}));
        assertEquals(false, ArraysAreSame.comp(new int[]{2,2,3}, new int[]{4,9,9}));
    }
}
