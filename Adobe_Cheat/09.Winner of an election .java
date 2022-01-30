// { Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class GfG
    {
        public static void main (String[] args)
        {
            
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int n = sc.nextInt();
                String arr[] = new String[n];
                
                for(int i = 0; i < n; i++)
                    arr[i] = sc.next();
                
                Solution obj = new Solution();    
                  //String result[] = obj.winner(arr, n);  
                System.out.println(result[0] + " " + result[1]);
                
               
            }
            
        }
    }
    // } Driver Code Ends
    
    
    //User function Template for Java
    
    
    class Solution
    {
        //Function to return the name of candidate that received maximum votes.
        public static String[] winner(String arr[], int n)
        {
            // add your code
            Arrays.sort(arr);
             int count = 1; 
       int maxi =Integer.MIN_VALUE; 
       String res = " ";
       for(int i=1;i<n;i++)
        {
       if(!arr[i].equals(arr[i-1]))
       {
    
         if(count>maxi)
    
            { 
    
         maxi = count;
    
          res = arr[i-1]; 
    
           } 
    
        count = 1;
    
         }
    
       else{
      
        count++; 
    
        } 
    
        } 
    
        if(count>maxi)
    
        { 
    
        maxi = count;
    
        res = arr[n-1];
    
       } 
    
       String st[]=new String[2];
    
       st[0]=res;
    
       st[1]=Integer.toString(maxi); 
    
        return st;
        }
    }
    
    