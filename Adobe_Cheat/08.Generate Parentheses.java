// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public List<String> AllParenthesis(int n) 
    {
      List<String> Al= new ArrayList<>();
      traverse(n,0,0, Al,"");
      return Al;
      }
     void traverse(int n, int l, int r, List<String> Al,String st){
     if(st.length()==2*n){
     Al.add(st);
     return ;
   }
   if(l<n) 
  traverse(n,l+1,r, Al,st+ "(");

  if(r<l) 
  traverse(n,l,r+1,Al,st+ ")");
    }
}