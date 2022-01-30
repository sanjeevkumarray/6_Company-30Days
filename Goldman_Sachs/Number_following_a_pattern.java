
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            //String S = read.readLine();
            //Solution ob = new Solution();
            //System.out.println(ob.printMinNumberForPattern(S));
        }
    }
}
class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        String res ="";
         Stack<Integer> st = new Stack<Integer>();
          for (int i = 0; i <= S.length(); i++) {
              st.push(i + 1);
              if (i == S.length() || S.charAt(i) =='I') {
                  while (!st.empty()) {
                      res += String.valueOf(st.peek());
                    res += "";
                    st.pop();
                }
            }
        }
        return res;
    }
}
