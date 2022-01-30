// { Driver Code Starts
//Initial Template for Java

import java.util.*; 
import java.io.*;
import java.lang.*;

class DriverClass
{
	public static void main(String[] args) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
            
            GFG g = new GFG();
            //  g.rotate(arr);   // correct  // vs code not working
            printMatrix (arr);
        }
	} 
	
	static void printMatrix(int arr[][]) 
	{ 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[0].length; j++) 
				System.out.print(arr[i][j] + " "); 
			System.out.println(""); 
		} 
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG
{
    static void rotate(int matrix[][]) 
    {
        // Code Here
           // Transpose
           int n= matrix.length;
              for(int i=0; i<n;i++){
                     for(int j=0; j<i;j++){
                            int  temp=matrix[i][j];
                                matrix[i][j]=matrix[j][i];
                                  matrix[j][i]=temp;
                     }
              }
                //Reverse 
                   for(int i=0; i<n/2; i++){
                          int[] temp= matrix[i];
                             matrix[i]= matrix[n-i-1];
                             matrix[n-i-1]=temp;
                   }
    }
}