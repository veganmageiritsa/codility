package stackqueue;

import java.util.Stack;

public class Nested {
    public static void main(String[] args) {

        String S="((()))";
        System.out.println(nested(S));

    }

    private static int nested(String S) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case '(':
                    stack.push(S.charAt(i));
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') return 0;
                    else stack.pop();
                    break;
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
