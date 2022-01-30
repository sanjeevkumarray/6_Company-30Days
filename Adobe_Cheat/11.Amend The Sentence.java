// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            
            
            // input n array elements
            String s = read.readLine();

            Solution ob = new Solution();
        
            System.out.println(ob.amendSentence(s));
        }
    } 
} // } Driver Code Ends


//User function Template for Java

 class Solution{
    public String amendSentence(String s){
        //code here
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            //if its 1st letter then add lowercase of it to ans
            if(cnt==0){
                if(Character.isUpperCase(c))
                    sb.append(Character.toLowerCase(c));
                else sb.append(c);
                cnt=1;
            }
            
            //else if its in middle of sentence
            else{
                
                //if it is uppercase then new word so add space and then add lowercase of letter
                if(Character.isUpperCase(c)){
                    sb.append(" ");
                    sb.append(Character.toLowerCase(c));
                }
                
                //else if its lowercase letter just add it
                else{
                    sb.append(c);
                }
                
            }
        }
        
        return sb.toString();
}

}
