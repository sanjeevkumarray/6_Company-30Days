// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int n = Integer.parseInt(input[0]); 
            int x = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
               //System.out.println(ob.numOfWays(n, x));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    static int numOfWays(int num, int n)
    {
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return numOfWays(num, n / 2) * numOfWays(num, n / 2);
        else
            return num *numOfWays(num, n / 2) * numOfWays(num, n / 2);
    }

    static int   solve(int x, int n, int curr_num, int curr_sum)
       {
        int results = 0;
        int p = numOfWays(curr_num, n);
        while (p + curr_sum < x) {
            results += solve(x, n, curr_num + 1,p + curr_sum); 
             curr_num++;
             p = numOfWays(curr_num, n);
        }
        if (p + curr_sum == x)
            results++;

        return results;
    }
}