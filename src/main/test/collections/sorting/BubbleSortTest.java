package main.test.collections.sorting;


import main.java.interview.collections.sorting.algorithms.BubbleSort;
import org.junit.*;

public class BubbleSortTest {

    @Test
    public void bubbleSortTest() {
        int[] numbers = {6, 45, 3, 12, 109, 1, 9, 800, 400};
        int[] expectedNumbers = {1, 3, 6, 9, 12, 45, 109, 400, 800};

        BubbleSort.bubbleSort(numbers);

        Assert.assertArrayEquals(expectedNumbers, numbers);
    }
}
