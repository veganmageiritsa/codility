package countingelements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MisssingInteger {

    public static void main(String[] args) {
     int []A={-1,-3,1,5,3,7};
        System.out.println(missingInteger(A));
    }

    private static int missingInteger(int[] A) {
        int num=1;
        Set<Integer> numbers = Arrays.stream(A).boxed().collect(Collectors.toSet());
        while(numbers.contains(num))
            num++;
        return num;

    }
}
