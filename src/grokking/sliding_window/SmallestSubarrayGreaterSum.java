package grokking.sliding_window;

public class SmallestSubarrayGreaterSum {
    public static void main(String[] args) {
        System.out.println(findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 }));

    }

    public static int findMinSubArray(int S, int[] arr) {
        int sum = 0;
        int window = 0;
        int length = 0;
        int minLength = arr.length + 1;
        for (int i = 0 ; i<arr.length; i++){
            sum+=arr[i];
            length++;
            while(sum>=S){
                if(length<minLength){
                    minLength = length;
                }
                sum-=arr[window];
                window++;
                length--;
            }
        }
        return minLength == arr.length +1 ? 0 : minLength;
    }
}
