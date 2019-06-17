package maxsliceproblem;

public class MaxProfit {

    public static void main(String[] args) {
        int A[] = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(maxProfit(A));
    }

    private static int maxProfit(int[] A) {
        if (A.length == 0)
            return 0;

        int minPrice = A[0];
        int maxEndHere = 0;
        int maxProfit = 0;
        for (int i = 1; i < A.length; i++) {
            maxEndHere = Math.max(0, A[i] - minPrice);
            minPrice = Math.min(minPrice, A[i]);
            maxProfit = Math.max(maxProfit, maxEndHere);
        }
        return maxProfit;
    }
}

//        int max=A[1]-A[0];
//        for (int i=0;i<A.length-1;i++)
//            for(int j=i+1;j<A.length;j++){
//                if(A[j]-A[i]>max)
//                    max=A[j]-A[i];
//            }
//        return max;


