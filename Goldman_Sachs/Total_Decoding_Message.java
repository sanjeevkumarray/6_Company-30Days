
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
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            System.out.println(ans);
        }
    }
}


class Solution
{
    public int CountWays(String s)
    {
        // code here
        int n=s.length();
        
       int dp[]=new int[n+1];
       
        if(s.charAt(0) == '0')return 0;
       
       dp[0]=1;
       dp[1]=1;
       for(int i=2;i<=n;i++)
        {
        int p1 = 0, p2 = 0 ;
        
        if(s.charAt(i-1) > '0') p1 = dp[i-1];

   if(s.charAt(i-2) == '1' || (s.charAt(i-2) == '2' && s.charAt(i-1) < '7')) p2 = dp[i-2];

     dp[i] = (p1+p2)%1000000007;
}
     
       return dp[n];
    }
}