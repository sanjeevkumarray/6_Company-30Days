// { Driver Code Starts
//Initial Template for Java
/*
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.decodedString(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java
*/

class Solution{
    static String decodedString(String str){
        
         Stack<Integer>st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        String temp = "", res = "";
      
        for (int i = 0; i < str.length(); i++)
        {
            int count = 0;
      
            if (Character.isDigit(str.charAt(i)))
            {
                while (Character.isDigit(str.charAt(i)))
                {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
      
                i--;
                st1.push(count);
            }
      
            
            else if (str.charAt(i) == ']')
            {
                temp = "";
                count = 0;
      
                if (!st1.isEmpty())
                {
                    count = st1.peek();
                    st1.pop();
                }
      
                while (!st2.isEmpty() && st2.peek()!='[' )
                {
                    temp = st2.peek() + temp;
                    st2.pop();
                }
      
                if (!st2.empty() && st2.peek() == '[')
                    st2.pop();
      
               
                for (int j = 0; j < count; j++)
                    res = res + temp;
      

                for (int j = 0; j < res.length(); j++)
                    st2.push(res.charAt(j));
      
                res = "";
            }
      
           
            else if (str.charAt(i) == '[')
            {
                if (Character.isDigit(str.charAt(i-1)))
                    st2.push(str.charAt(i));
      
                else
                {
                    st2.push(str.charAt(i));
                st1.push(1);
                }
            }
      
            else
                st2.push(str.charAt(i));
        }
      
       
        while (!st2.isEmpty())
        {
            res = st2.peek() + res;
            st2.pop();
        }
      
        return res;
    }
    
}