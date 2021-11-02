package sort;

import java.util.Arrays;
import java.util.List;

public class AbstractSortTest {

    protected List<Integer> sort(List<Integer> input) {
        return sort(input, new TimSort()); // default algorithm
    }

    protected List<Integer> sort(List<Integer> input, SortAlgorithm algorithm) {
        return algorithm.sort(input);
    }











    // Dumb - for coverage demo purposes only
    protected List<Integer> sortAll(List<Integer> input) {
        List<Integer> output;
        output = sort(input, new BubbleSort());
        output = sort(input, new CocktailShakerSort());
        output = sort(input, new CombSort());
        output = sort(input, new CycleSort());
        output = sort(input, new GnomeSort());
        output = sort(input, new HeapSort());
        output = sort(input, new InsertionSort());
        output = sort(input, new MergeSort());
        output = sort(input, new PancakeSort());
        output = sort(input, new SelectionSort());
        output = sort(input, new QuickSort());
        output = sort(input, new ShellSort());
        output = sort(input, new TimSort());
        return output;
    }
}
