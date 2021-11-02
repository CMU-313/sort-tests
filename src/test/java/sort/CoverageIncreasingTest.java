package sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoverageIncreasingTest extends AbstractSortTest {

    @Test
    public void testSort() {
        var input = Arrays.asList(
                7,  3,  5, 10, 17,  4, 11,  2, 26, 16, 23, 28, 15, 27, 21,  8, 13,  1, 20, 35, 29, 14, 30, 22,
                24,  6,  9, 19, 32, 33, 12, 31, 34, 25,  0, 18
        );
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            output.add(i);
        }
        assert sort(input).equals(output);
    }
}
