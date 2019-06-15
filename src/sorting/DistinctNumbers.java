package sorting;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctNumbers {
    public static void main(String[] args) {

        int[] A = {1, 3, 2, 1, 1, 2, 3, 4, 3};
        System.out.println(distinctNumbers(A));
    }

    private static int distinctNumbers(int[] A) {
        Set<Integer> numbers = Arrays.stream(A).boxed().collect(Collectors.toSet());
        return numbers.size();
    }
}
