package timecomplexity;

public class TapeEquilibrium {

    public static void main(String[] args) {
//        int[]A= {10,20,30,20,10,40,30,40,91};
        int []A={3,1,2,3,4};

        System.out.println(tapeEquilibrium(A));

    }

    private static int tapeEquilibrium(int[] A) {

        long sumright = 0;
        long sumleft ;
        long ans;

        for (int i =1;i<A.length;i++)
            sumright += A[i];

        sumleft = A[0];
        ans =Math.abs( sumleft - sumright);

        for (int i=1; i<A.length; i++)
        {
            if (Math.abs( sumleft - sumright ) < ans)
                ans = Math.abs( sumleft - sumright );
            
            sumleft += A[i];
            sumright -=A[i];
        }
        return (int) ans;
    }
}

