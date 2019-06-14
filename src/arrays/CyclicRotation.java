package arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        int[]a = {10,20,30,20,10,40,30,40,91};
        rotateArray(a,3);

        for (int i : a) {
            System.out.println(i);
        }

        }


    // Function to rotate the array elements

    static void rotateArray(int[] array, int n) {

        int i, j, temp, temp1;

        for (i = 1; i <= n; i++) {

            temp = array[0];

            for (j = 0; j < array.length; j++) {

                temp1 = array[(j + 1) % array.length];

                array[(j + 1) % array.length] = temp;

                temp = temp1;

            }

        }
    }
}
