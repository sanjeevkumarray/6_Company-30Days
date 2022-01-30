// { Driver Code Starts
    import java.io.*;
    import java.util.*;
    class GFG
    {
        public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int r = sc.nextInt();
                int c = sc.nextInt();
                
                int matrix[][] = new int[r][c];
                
                for(int i = 0; i < r; i++)
                {
                    for(int j = 0; j < c; j++)
                     matrix[i][j] = sc.nextInt();
                }
                Solution ob = new Solution();
               // ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);   // code sahi hai vs code not supported
                for (Integer val: ans) 
                    System.out.print(val+" "); 
                System.out.println();
            }
        }
    }// } Driver Code Ends
    
    
    class Solution
    {
        //Function to return a list of integers denoting spiral traversal of matrix.
        static ArrayList<Integer> spirallyTraverse(int matrix[][],int r, int c)
        {
            // code here 
            ArrayList <Integer> res = new ArrayList<>();
             int minr = 0;
             int  maxr = c-1;
             int minc = 0;
             int maxc = r-1;
            
            while(minr<=maxc &&minc<=maxr){
                
                for(int i = minc ; i<=maxr ; i++)
                res.add(matrix[minr][i]);
                minr++;
                
             for(int i = minr ; i<=maxc ; i++)
            res.add(matrix[i][maxr]);
            maxr--;
    
          if(minr<=maxc)
          {
          for(int i = maxr ; i>=minc ; i--)
          res.add(matrix[maxc][i]);
          maxc--;
         }
         
         if(minc<=maxr)
        {
       for(int i = maxc ; i>=minr ; i--)
       res.add(matrix[i][minc]);
       minc++;
        }
        }
                
            return res;
        }
    }
    