package sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegressionTest extends AbstractSortTest {

    @Test
    public void noRegressions() {
        var input = Arrays.asList(
                7,  3,  5, 10, 17,  4, 11,  2, 26, 16, 23, 28, 15, 27, 21,  8, 13,  1, 20, 35, 29, 14, 30, 22,
                24,  6,  9, 19, 32, 33, 12, 31, 34, 25,  0, 18
        );

        // System.out.println(sort(input).hashCode());
        assert sort(input).hashCode() == 544880531;
    }
}
