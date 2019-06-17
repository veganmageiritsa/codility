package maxsliceproblem;

public class MaxSliceSum {
    public static void main(String[] args) {
        int A[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSliceSum(A));
    }

    private static int maxSliceSum(int[] A) {
        int absoluteMax = A[0];

        int localMax = A[0];

        int nextSum = 0;

        for (int i = 1; i < A.length; i++) {

            nextSum = localMax +  A[i];

            localMax = Math.max(A[i], nextSum);

            absoluteMax = Math.max(absoluteMax, localMax);

        }

        return absoluteMax;
    }
}
