// { Driver Code Starts
    import java.util.*;
    import java.io.*;
    import java.lang.*;
    
    class DriverClass
    {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                ArrayList<ArrayList<Integer>> list = new ArrayList<>();
                int V = sc.nextInt();
                int E = sc.nextInt();
                for(int i = 0; i < V+1; i++)
                    list.add(i, new ArrayList<Integer>());
                for(int i = 0; i < E; i++)
                {
                    int u = sc.nextInt();
                    int v = sc.nextInt();
                    list.get(u).add(v);
                    list.get(v).add(u);
                }
                int c = sc.nextInt();
                int d = sc.nextInt();
                
                Solution ob = new Solution();
                
                    //System.out.println(ob.isBridge(V,list,c,d));   //code correct
            }
        }
    }// } Driver Code Ends
    
    
    // User function Template for Java
    
    class Solution
    {
        //Function to find if the given edge is a bridge in graph.
        static int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d)
        {
            // code here
            boolean visited[]=new boolean[V];
           Queue<Integer> q=new LinkedList<Integer>();
          q.add(c);
          visited[c]=true;
          while(q.size()>0)
             {
             int x=q.poll();
          for(int i:adj.get(x)){
          if(visited[i]==false)
          {
          if(x==c && i==d)
           continue;
          if(x==d && i==c)
          continue;
         q.add(i);
         visited[i]=true;
        }
       }
      }
       if(visited[d] == false)
      return 1;
       return 0;
        //return !visited[d]?1:0;
    
        }
    }
    