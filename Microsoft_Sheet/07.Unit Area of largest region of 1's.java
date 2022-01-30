// { Driver Code Starts
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
                String[] s = br.readLine().trim().split(" ");
                int n = Integer.parseInt(s[0]);
                int m = Integer.parseInt(s[1]);
                int[][] grid = new int[n][m];
                for(int i = 0; i < n; i++){
                    String[] S = br.readLine().trim().split(" ");
                    for(int j = 0; j < m; j++){
                        grid[i][j] = Integer.parseInt(S[j]);
                    }
                }
                Solution obj = new Solution();
                int ans = obj.findMaxArea(grid);
                System.out.println(ans);
            }
        }
    }// } Driver Code Ends
    
    
    class Solution
    {
        //Function to find unit area of the largest region of 1s.
        public int findMaxArea(int[][] grid)
        {
            // Code here
            int [][] visited = new int[grid.length][grid[0].length] ;
             int maxi = 0 ;
            for(int i = 0 ; i < grid.length ; i++){
           for(int j = 0 ; j < grid[0].length ; j++){
           int y = find(grid , visited , i , j );
         if(y > maxi)
         maxi = y;
       }
      }
      return maxi ;
    }
    public int find (int[][] grid , int[][] visited , int r , int c){
    if(r<0 || r> grid.length-1 || c <0 || c>grid[0].length-1 )
    return 0 ;
    if(visited[r][c] == 1)
    return 0 ;
    visited[r][c] = 1 ;
    int cnt = 1 ;
    if(grid[r][c] == 1){
    cnt += find(grid , visited , r+1 , c) ;
    cnt += find(grid , visited , r-1 , c) ;
    cnt += find(grid , visited , r , c+1) ;
    cnt += find(grid, visited , r , c-1 ) ;
    cnt += find(grid , visited , r+1 , c+1) ;
    cnt += find (grid , visited , r+1 , c-1) ;
    cnt += find (grid , visited , r-1 , c+1) ;
    cnt += find(grid , visited , r-1 ,c-1) ;
    return cnt ;
    }
    return 0 ;
        }
    }