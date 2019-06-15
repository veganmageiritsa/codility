package stackqueue;

import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(checkBrackets(s));
    }

    private static int checkBrackets(String S) {

        if (S.length() == 0) return 1;

        Stack<Character> brackets = new Stack<>();

        for (int position = 0; position < S.length(); ++position) {
            char c = S.charAt(position);
            {

                if (c == '[' || c == '{' || c == '(') {
                    brackets.push(c);
                } else {
                    // return 0 if no opening brackets found and
                    // first bracket is a closing bracket
                    if (brackets.size() == 0) return 0;

                    if (c == ')') {
                        if (brackets.peek() == '(') brackets.pop();
                        else return 0;
                    }

                    if (c == '}') {
                        if (brackets.peek() == '{') brackets.pop();
                        else return 0;
                    }

                    if (c == ']') {
                        if (brackets.peek() == '[') brackets.pop();
                        else return 0;
                    }
                }
            }

        }

        if (brackets.size() == 0) return 1;

        return 0;
    }
}
//        Stack<Character> opening_brackets_stack = new Stack<>();
//        for (int position = 0; position < S.length(); ++position) {
//            char next = S.charAt(position);
//
//            if (next == '(' || next == '[' || next == '{') {
//                opening_brackets_stack.push(next);
//            }
//
//            if (next == ')' || next == ']' || next == '}') {
//                if (opening_brackets_stack.isEmpty()){
//                    break;
//                }
//                char top=opening_brackets_stack.pop();
//                if (!match(top,next)) {
//                    break;
//                }
//            }
//        }
//        if (opening_brackets_stack.isEmpty())
//            return 1;
//        return 0;


//    private static boolean match(char top, char next) {
//        if (top== '[' && next == ']')
//            return true;
//        if (top== '{' && next == '}')
//            return true;
//        if (top== '(' && next == ')')
//            return true;
//        return false;
//    }

