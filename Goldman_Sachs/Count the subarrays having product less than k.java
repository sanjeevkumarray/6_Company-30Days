

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.countSubArrayProductLessThanK(a, n, k));
            
        }
	}
}


class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
          long sum =1;
        int cnt = 0 ,  l = 0 ;
        //long sum =1;
          for(int i = 0 ; i < n ; i++){
          sum *= a[i] ;
           while( l<n && sum >= k){
          sum /= a[l++] ;
           }
          cnt += (i-l+1) ;
    }
       return cnt;
    }
}
