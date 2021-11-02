package sort;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(JUnitQuickcheck.class)
public class PropertyTest extends AbstractSortTest {

    @Property
    public void testSameLength(List<Integer> input) {
        var output = sort(input);
        // Check length
        assert output.size() == input.size() : "Length should match";
    }





    @Property
    public void testSameContents(List<Integer> input) {
        var output = sort(input);

        // Check integrity
        for (var x : input) {
            assert output.contains(x) : "Output should contain same elements as input";
        }
    }

    @Property
    public void testOrdered(List<Integer> input) {
        var output = sort(input);

        // Check sortedness
        for (int i = 0; i < output.size()-1; i++) {
            assert output.get(i) <= output.get(i+1) : "Consecutive elements must be ordered";
        }
    }


    // Test length, integrity, and ordering all at once --- is this a complete spec?
    @Property
    public void testSorted(List<Integer> input) {
        var output = sort(input);

        // Check length
        assert output.size() == input.size() : "Length should match";

        // Check integrity
        for(var x : input) {
            assert output.contains(x) : "Output should contain same elements as input";
        }

        // Check sortedness
        for (int i = 0; i < output.size()-1; i++) {
            assert output.get(i) <= output.get(i+1) : "Consecutive elements must be ordered";
        }
    }

}
