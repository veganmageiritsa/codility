package grokking.sliding_window;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        System.out.println("Maximum sum of a subarray of size K: "
                + findMaxSumSubArray(3, new int[]{2, 1, 5, 1, 3, 2}));
        System.out.println("Maximum sum of a subarray of size K: " +
                findMaxSumSubArray(2, new int[]{2, 3, 4, 1, 5}));
    }

    public static int findMaxSumSubArray(int k, int[] arr) {
        int max = 0;
        int sum = 0;
        int windowStart = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i >= k - 1) {
                if (sum > max) {
                    max = sum;
                }
                sum -= arr[windowStart];
                windowStart++;
            }
        }
        return max;
    }
}
