package timecomplexity;

public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(frogJumps(10, 100, 30));
    }

    public static int frogJumps(int X, int Y, int D) {
        if ((Y - X) % D == 0)
            return (Y - X) / D;
        else
            return ((Y - X) / D) + 1;
    }
}

