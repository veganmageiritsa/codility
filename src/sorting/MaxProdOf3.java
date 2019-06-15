package sorting;

import java.util.Arrays;

public class MaxProdOf3 {
    public static void main(String[] args) {
        int A[]={-2,3,5,8,-1,-4,9};
        System.out.println(maxProductOfThree(A));
    }

    private static int maxProductOfThree(int[] A) {
        Arrays.sort(A);
        int F = 0, L = A.length - 1;
        int s1 = A[F] * A[F + 1] * A[F + 2];
        int s2 = A[F] * A[F + 1] * A[L];
        int s3 = A[F] * A[L - 1] * A[L];
        int s4 = A[L - 2] * A[L - 1] * A[L];
        return Math.max(Math.max(s1, s2), Math.max(s3, s4));
    }
}
