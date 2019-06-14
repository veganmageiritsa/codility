package countingelements;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class PermutationCheck {

    public static void main(String[] args) {
        int []A ={1,2,3,4,5,6,7,8,9,9,9,9};
        System.out.println(permCheck(A));
    }

    private static int permCheck(int[] A) {
        int max =  Arrays.stream(A).max().getAsInt();
        Set<Integer> unique = Arrays.stream(A).boxed().collect(Collectors.toSet());
        if (unique.size()==max && unique.size()==A.length)
            return 1;
        return 0;
    }
}
