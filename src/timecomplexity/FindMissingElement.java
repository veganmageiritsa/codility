package timecomplexity;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindMissingElement {

    public static void main(String[] args) {

        int[]A= {1,2,3,5};
        System.out.println(missingElemet(A));
    }

    private static int missingElemet(int A[]) {
        int N = A.length+1;
        int sum=N*(N+1)/2;
        int total = Arrays.stream(A).sum();
        return sum-total;
    }
}
