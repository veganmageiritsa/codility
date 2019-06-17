package eukleides;

public class ChocoNumbers {
    public static void main(String[] args) {
        int N=22; int M=4;
        System.out.println(chocoNo(N,M));
    }

    private static int chocoNo(int N, int M) {

        if(N==0)
            return 1;
        int A[]=new int[N];
        int i=0;
        int choc=0;
        while(A[i]!=1){
            choc++;
            A[i]=1;
            i=(i+M)%N;
        }
        return choc;
    }
}
