// { Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
	// Your code here
	   char ch[]=str.toCharArray();
      for(char i=0;i<str.length();i++)
      {
          if(Character.isLetter(ch[i]))
           return -1;
      }
     return  Integer.parseInt(str);
    }
}

/*
try{
int ch= Integer.parseInt(str);
return ch;

}
catch(Exception e){
return -1;
}
*/