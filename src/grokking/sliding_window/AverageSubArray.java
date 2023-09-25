package grokking.sliding_window;

import java.util.Arrays;

public class AverageSubArray {

    public static void main(String[] args) {
        double[] result = findAverages(5,
                new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2});
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
    }

    private static double[] findAverages(int k, int[] numbers) {
        double[] result = new double[numbers.length - k + 1];
        int sum = 0;
        int windowStart = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (i >= k - 1) {
                result[windowStart] = (double) sum / k;
                sum -= numbers[windowStart];
                windowStart++;
            }
        }
        return result;
    }
}
