package prefixsums;

public class CountDiv {
    public static void main(String[] args) {
        int A = 0;
        int B = 1;
        int K = 11;
        System.out.println(countDiv(A, B, K));

    }

    private static int countDiv(int A, int B, int K) {
        int maxDiv=B/K;
        int minDiv=(A-1)/K;
        return maxDiv-minDiv;
//        int max = B;
//        for (int i = B; i >= A; i--) {
//            if (i % K == 0) {
//                max = i;
//                break;
//            }
//        }
//        int divisions = (max - A) / K;
//
//        return ++divisions;


    }
}
