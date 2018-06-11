package main.test.exercises;

import main.java.exercises.StringMerger;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringMergerTest {

    @Test
    public void normalHappyFlow() {
        assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
        assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
        assertFalse("Codewars are not codwars", StringMerger.isMerge("codewars", "cod", "wars"));
        assertFalse("codewars can't be created from code and wasr", StringMerger.isMerge("codewars", "code", "wasr"));
        assertTrue("Going bananas!", StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
    }
}
