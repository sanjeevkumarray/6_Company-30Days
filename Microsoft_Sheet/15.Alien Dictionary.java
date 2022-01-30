// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    
		    String[] words = new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        words[i] = sc.next();
		    }
		    
		    Solution ob = new Solution();
		  //  System.out.println(T.findOrder(words,k));
		    String order = ob.findOrder(words,n,k);
		    if(order.length() == 0){
		        System.out.println(0);
		        continue;
		    }
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    
		    Arrays.sort(temp, new Comparator<String>(){
		    
		      @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for(int i = 0; i < Math.min(a.length(), b.length()) 
                                        && index1 == index2; i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }
                
                    if(index1 == index2 && a.length() != b.length()) 
                    {
                        if(a.length() < b.length())
                            return 1;
                        else
                            return 0;
                    }
                
                    if(index1 < index2)
                        return 1;
                    else
                        return 0;
                        
                }
		    });
		    
		    int flag = 1;
		    for(int i=0;i<n;i++)
		    {
		        if(!words[i].equals(temp[i]))
	            {
	                flag = 0;
	                break;
	            }
		    }
		    
		    System.out.println(flag);
		}
	}
	
}
// } Driver Code Ends


//User function Template for Java

class Solution{
  private boolean[] visited;
    private Stack<Character> st;
    private LinkedList<Integer>[] adj;
    
    public String findOrder(String[] dict, int N, int K) {
        this.st = new Stack<>();
        this.visited = new boolean[K];
        this.adj = (LinkedList<Integer>[]) new LinkedList[K];
        
        int i, x = N - 1;
        
        for(i = 0; i < K; ++i) {
            adj[i] = new LinkedList<>();
        }
        
        for(i = 0; i < x; ++i) {
            addEdge(dict[i], dict[i + 1]);
        }
        
        for(i = 0; i < K; ++i) {
            if(!visited[i]) {
                topologicalSort(i);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!st.empty()) {
            sb.append(st.pop());
        }
        
        return sb.toString();
    }
    
    private void addEdge(String a, String b) {
        int n = Math.min(a.length(), b.length()), i;
        
        Character ca = null, cb = null;
        
        for(i = 0; i < n; ++i) {
            if(a.charAt(i) != b.charAt(i)) {
                ca = a.charAt(i);
                cb = b.charAt(i);
                break;
            }
        }
        
        if(ca != null) {
            int u = ca - 'a';
            int v = cb - 'a';
            
            adj[u].add(v);
        }
    }
    
    private void topologicalSort(int start) {
        visited[start] = true;
        
        for(Integer k : adj[start]) {
            if(!visited[k]) {
                topologicalSort(k);
            }
        }
        
        st.add((char) ('a' + start));
    }
}