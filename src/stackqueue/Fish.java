package stackqueue;

import java.util.Stack;

public class Fish {
    public static void main(String[] args) {
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 1, 0};

        System.out.println("Result: " + fishFights(A, B));
    }

    private static int fishFights(int[] A, int[] B) {
        int alive = 0;
        Stack<Integer> downstreamFishes = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            if (B[i] == 0) { // upstream
                if (fightWithDownstreamFishes(A[i], downstreamFishes)) {
                    alive++;
                }
            } else if (B[i] == 1) { // downstream
                downstreamFishes.push(A[i]);
            }
        }

        return alive + downstreamFishes.size();
    }

    private static boolean fightWithDownstreamFishes(int upstreamFish, Stack<Integer> downstreamFishes) {
        while (!downstreamFishes.empty()) {
            if (upstreamFish > downstreamFishes.peek()) {
                downstreamFishes.pop();
            } else {
                return false;
            }
        }
        return true;
    }

}
