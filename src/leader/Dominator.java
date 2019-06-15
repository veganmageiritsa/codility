package leader;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dominator {
    public static void main(String[] args) {
        int []A={3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println(dominator(A));
    }

    private static int dominator(int[] A) {
        Map<Integer, Long> occurrences =
                Arrays.stream(A)
                        .boxed()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Integer max=occurrences.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        if(occurrences.get(max)>A.length/2) {
            int pos = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == max) {
                    pos = i;
                    break;
                }
            }
            return pos;
        }
        return -1;
    }

}
