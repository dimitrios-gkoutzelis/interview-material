package main.test.exercises;

import main.java.exercises.ReverseLinkedList;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class ReverseLinkedListTest {

    @Test
    public void testLinkedListReversion() {
        LinkedList<String> strings = new LinkedList<String>();

        strings.add("Monaco");
        strings.add("Paris");
        strings.add("London");
        strings.add("Zurich");

        LinkedList<String> reversedStrings = new LinkedList<String>();

        reversedStrings.add("Zurich");
        reversedStrings.add("London");
        reversedStrings.add("Paris");
        reversedStrings.add("Monaco");

        Assert.assertEquals(ReverseLinkedList.reverseList(strings), reversedStrings);
    }
}
