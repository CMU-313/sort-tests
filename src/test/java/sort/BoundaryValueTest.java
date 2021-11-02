package sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BoundaryValueTest extends AbstractSortTest {

    @Test
    public void preSorted() {
        var input = Arrays.asList(1, 2, 3);
        var output = Arrays.asList(1, 2, 3);
        assert sort(input).equals(output);
    }

    @Test
    public void antiSorted() {
        var input = Arrays.asList(3, 2, 1);
        var output = Arrays.asList(1, 2, 3);
        assert sort(input).equals(output);
    }

    @Test
    public void empty() {
        List<Integer> empty = Collections.emptyList();
        assert sort(empty).equals(empty);
    }

    @Test
    public void single() {
        var single = Arrays.asList(42);
        assert sort(single).equals(single);
    }

    @Test
    public void duplicateEntries1() {
        var input = Arrays.asList(2, 1, 2);
        var output = Arrays.asList(1, 2, 2);
        assert sort(input).equals(output);
    }

    @Test
    public void duplicateEntries2() {
        var input = Arrays.asList(1, 2, 1);
        var output = Arrays.asList(1, 1, 2);
        assert sort(input).equals(output);
    }

    @Test
    public void allEqual() {
        var input = Arrays.asList(5, 5);
        var output = Arrays.asList(5, 5);
        assert sort(input).equals(output);
    }
}
