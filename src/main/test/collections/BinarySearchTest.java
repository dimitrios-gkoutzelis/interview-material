package main.test.collections;

import main.java.interview.collections.sorting.algorithms.BinarySearch;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        List<Integer> sortedNumbers = Arrays.asList(1, 3, 6, 9, 12, 45, 109, 400, 800);

        Assert.assertTrue(BinarySearch.binarySearch(sortedNumbers, 400));
    }
}
