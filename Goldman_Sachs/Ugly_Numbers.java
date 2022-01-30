
    import java.io.*;
    import java.util.*;
    
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
    
                System.out.println(new Solution().getNthUglyNo(n));
            }
        }
    }
    
    
    class Solution {
        /* Function to get the nth ugly number*/
        long getNthUglyNo(int n) {
            // code here
             long ugly[] = new long[n];
            int i2 = 0, i3 = 0, i5 = 0;
            long next_mul_of_2 = 2;
            long next_mul_of_3 = 3;
            long next_mul_of_5 = 5;
            ugly[0] = 1;
            long next_ugly_no = 1;
            //ugly[0] = 1;
            for (int i = 1; i < n; i++)
            {
                next_ugly_no
                    = Math.min(next_mul_of_2,
                               Math.min(next_mul_of_3,
                                        next_mul_of_5));
     
                ugly[i] = next_ugly_no;
                if (next_ugly_no == next_mul_of_2)
                {
                    i2++;
                    next_mul_of_2 = ugly[i2] * 2;
                }
                if (next_ugly_no == next_mul_of_3)
                {
                    i3++;
                    next_mul_of_3 = ugly[i3] * 3;
                }
                if (next_ugly_no == next_mul_of_5)
                {
                    i5++;
                    next_mul_of_5 = ugly[i5] * 5;
                }
            }
             
            
            return next_ugly_no;
        }
        
    }