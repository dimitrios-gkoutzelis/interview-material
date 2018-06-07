package main.test.exercises;

import main.java.exercises.SpinWords;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpinWordsTest {


    @Test
    public void test() {
        assertEquals("emocleW", SpinWords.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", SpinWords.spinWords("Hey fellow warriors"));
    }
}
