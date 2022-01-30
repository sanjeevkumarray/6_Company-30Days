// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int K = Integer.parseInt(in.readLine());
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int A[] = new int[N];
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            //System.out.println(ob.maxProfit(K, N, A));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int maxProfit(int K, int N, int A[]) {
        // code here
         int[][] profit = new int[K+1][N+1];
           for(int i=0; i<=K;i++)   profit[i][0]=0;
           for(int j=0;j<=N;j++)   profit[0][j]=0;
            for(int i=1; i<=K;i++){
                 for(int j=1; j<N;j++){
                       int max =0;
                        for(int r=0; r<j;r++)
                        max=Math.max(max,A[j]-A[r]+profit[i-1][r]);
                        profit[i][j]=Math.max(profit[i][j-1],max);
                 }
            }
             return profit[K][N-1];
            
    }
}