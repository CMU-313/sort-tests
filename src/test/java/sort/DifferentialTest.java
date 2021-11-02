package sort;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(JUnitQuickcheck.class)
public class DifferentialTest extends AbstractSortTest {

    // Single differential test - no need to specify the expected output
    @Test
    public void timSortQuickSortIsConsistent() {
        var input = Arrays.asList(
                7,  3,  5, 10, 17,  4, 11,  2, 26, 16, 23, 28, 15, 27, 21,  8, 13,  1, 20, 35, 29, 14, 30, 22,
                24,  6,  9, 19, 32, 33, 12, 31, 34, 25,  0, 18
        );
        var timSortOutput = sort(input, new TimSort());
        var quickSortOutput = sort(input, new QuickSort());
        assert timSortOutput.equals(quickSortOutput);
    }


    // Differential property test - no need to specify either an input, output, or oracle!
    @Property
    public void timSortQuickSortIsAlwaysConsistent(List<Integer> input) {
        var timSortOutput = sort(input, new TimSort());
        var quickSortOutput = sort(input, new QuickSort());
        assert timSortOutput.equals(quickSortOutput);
    }

}
