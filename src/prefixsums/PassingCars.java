package prefixsums;

public class PassingCars {
    public static void main(String[] args) {
        int A [] = {0,1,0,1,1};
        System.out.println(passingCars(A));
    }

    private static int passingCars(int[] A) {

        int countOfZeros = 0, count = 0;

        for (int i = 0; i < A.length; i++){
            if (A[i] == 0) countOfZeros++;
            if (A[i] == 1) count += countOfZeros;
            if (count > 1000000000) return -1;
        }
        return count;

//        int pairs=0;
//        for (int i=0;i<A.length;i++){
//            if(A[i]==0)
//                for (int k=i;k<A.length;k++){
//                    if(A[k]==1)
//                        pairs++;
//                }
//        }
//        return pairs;
    }
}
