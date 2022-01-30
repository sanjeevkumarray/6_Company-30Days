
import java.io.*;
import java.util.*;
class Main {
    
    // compute reverse of a number
    public static long rev(long n)
    {
        long rev_num = 0;
         while(n > 0) 
          { 
            rev_num = rev_num*10 + n%10; 
            n = n/10; 
          } 
          return rev_num;
    }
    
	public static void main (String[] args) {
		Scanner scn=new Scanner(System.in);
		
        //testcases
		int T=scn.nextInt();
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int N;
		    
		    
            //input N
		    N=sc.nextInt();
		    int R=0;
		    
		    	    
            // reverse the given number n
		    R=(int)rev(N);
	
            //power of the number to it's reverse
		    long ans=(long)obj.power(N,R);
		    System.out.println(ans);
		    
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
        
    long power(int N,int R)
    {
        if(R == 0) return 1;
        long res = power(N, R/2);
        res = (res * res) % 1000000007;
        if(R % 2 != 0) return (res* N) % 1000000007;
        return res;
    }

}
