package sort;

import org.junit.Test;

import java.util.Arrays;

public class BasicUnitTest extends AbstractSortTest {

    @Test
    public void testSort() {
        var input = Arrays.asList(1, 2, 3);
        var output = Arrays.asList(1, 2, 3);
        assert sort(input).equals(output);
    }
}
