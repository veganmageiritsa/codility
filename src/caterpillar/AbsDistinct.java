package caterpillar;

import java.util.HashSet;

public class AbsDistinct {
    public static void main(String[] args) {
        int A []={-5,-3,-1,0,3,6};
       int [] B={-5,-5,-5,-3,-3,-3,-1,0,0,1,3,5};
        System.out.println(countAbsDistinct(B));
    }

    private static int countAbsDistinct(int[] A) {
        HashSet<Integer> distAbs =new HashSet<>();
        for(Integer number:A)
            distAbs.add(Math.abs(number));
        return distAbs.size();
    }
}
