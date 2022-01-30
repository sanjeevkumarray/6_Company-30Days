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
                String A = br.readLine().trim();
                Solution ob = new Solution();
                String ans = ob.FirstNonRepeating(A);
                System.out.println(ans);
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution
    {
        public String FirstNonRepeating(String A)
        {
            // code here
            int charCount[] = new int[26] ;
            int l = A.length();
            Queue<Character> qu = new  LinkedList<>();
            StringBuffer res = new StringBuffer();
          for(int i = 0 ; i < l ; i++){
          char ch = A.charAt(i);
          qu.add(ch);
         charCount[ ch - 'a']++;
        while( !qu.isEmpty() && charCount [ qu.peek() - 'a'] > 1){
        qu.remove();
       }
        if(qu.isEmpty()){
        res.append("#");
         }
        else {
       res.append(qu.peek());
    }
    }
    return res.toString();
        }
    }