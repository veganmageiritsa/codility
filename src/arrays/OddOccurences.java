package arrays;

import java.util.HashSet;
import java.util.Set;

public class OddOccurences {

    public static void main(String[] args) {
        int[]a = {10,20,30,20,10,40,30,40,91};

        System.out.println(solution(a));
    }


    public static Integer solution(int[] a){
        Set<Integer> odd= new HashSet<>();
        for(int i:a) {
            if (odd.contains(i))
                odd.remove(i);
            else
                odd.add(i);
        }
        return odd.stream().findFirst().orElse(null);

    }
}
