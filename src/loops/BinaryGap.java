package loops;

public class BinaryGap {

        static int maxZeros(int N)
        {
            // variable to store the length of
            // longest consecutive 0's
            int maxm = -1;

            // to temporary store the consecutive 0's
            int cnt = 0;
            String binaryString = Integer.toBinaryString(N);
            for (int i=0;i<binaryString.length();i++){
                if(binaryString.charAt(i)=='0') {
                    cnt++;
                    maxm = Math.max(cnt, maxm);
                }
                else
                    cnt=0;
            }
//            while (N != 0) {
//                if ((N & 1) == 0 ) {
//                    cnt++;
//
//                    maxm = Math.max(maxm, cnt);
//                }
//                else {
//                    maxm = Math.max(maxm, cnt);
//                    cnt = 0;
//                }
//                N >>= 1;
//            }
            return maxm;
        }

        // Driver code
        public static void main(String args[])
        {
            int N = 529  ;
            System.out.println(maxZeros(N));


        }
        // This Code is contributed by ANKITRAI1
    }

