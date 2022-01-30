class Solution
{
    public static int NumberOfPath(int a, int b) 
    {
        //Your code here
        int[][] res = new int[a][b];
		 for(int i=0;i<a;i++) {
			 for(int j=0;j<b;j++) {
				 if(i==0||j==0) { 
					 res[i][j]=1;
				 }else {
					 res[i][j] = res[i][j-1]+res[i-1][j];//left+top
				 }
			 }
		 }
		 return res[a-1][b-1];
    }
}