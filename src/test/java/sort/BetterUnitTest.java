package sort;

import org.junit.Test;

import java.util.Arrays;

public class BetterUnitTest extends AbstractSortTest {

    @Test
    public void testSort() {
        var input = Arrays.asList(8, 16, 15, 4, 42, 23);
        var output = Arrays.asList(4, 8, 15, 16, 23, 42);
        assert sort(input).equals(output);
    }
}
