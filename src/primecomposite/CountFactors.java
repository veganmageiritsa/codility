package primecomposite;

public class CountFactors {
    public static void main(String[] args) {
        int N=1;
        System.out.println(countFactors(N));
    }

    private static int countFactors(int N) {
        int factors = 0;
        for (int i = 1; i <= Math.sqrt(N); i++){
            if (N % i == 0 && i*i<N)
                factors += 2;
        if (i * i == N)
            factors++;
    }

        return factors;
    }
}
