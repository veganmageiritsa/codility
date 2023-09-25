package grokking.two_pointers;

public class StringBackspace {
    public static void main(String[] args) {


//        System.out.println((removeBackspaces("xywrrmp").equals(removeBackspaces("xywrrmu#p"))));

        System.out.println(compare("xp#", "xyz##"));
    }
    private static String removeBackspaces(String s1){
        String s2 = s1;
        for (int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == '#'){
                int j = i;
                while (j<s1.length() && s1.charAt(j) == '#'){
                    j++;
                }
                 s2 = s1.substring(0, 2*i - j).concat(s1.substring(j));
                 i=j;
            }
        }
        return s2;
    }

    public static boolean compare(String str1, String str2) {
        // use two pointer approach to compare the strings
        int index1 = str1.length() - 1, index2 = str2.length() - 1;
        while (index1 >= 0 || index2 >= 0) {

            int i1 = getNextValidCharIndex(str1, index1);
            int i2 = getNextValidCharIndex(str2, index2);

            if (i1 < 0 && i2 < 0) // reached the end of both the strings
                return true;

            if (i1 < 0 || i2 < 0) // reached the end of one of the strings
                return false;

            if (str1.charAt(i1) != str2.charAt(i2)) // check if the characters are equal
                return false;

            index1 = i1 - 1;
            index2 = i2 - 1;
        }

        return true;
    }
    private static int getNextValidCharIndex(String str, int index) {
        int backspaceCount = 0;
        while (index >= 0) {
            if (str.charAt(index) == '#') // found a backspace character
                backspaceCount++;
            else if (backspaceCount > 0) // a non-backspace character
                backspaceCount--;
            else
                break;

            index--; // skip a backspace or a valid character
        }
        return index;
    }
}
