
import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends

class Solve {
    int[] findTwoElement(int arr[], int N) {
        // code here
        
        int ans[]=new int[2];
        for(int i = 0; i < N; i++)
        {
            arr[i] -= 1;
        }
        for(int i = 0; i < N; i++)
        {
            arr[arr[i] % N] += N;
        }
        
        for(int i = 0; i < N; i++)
        {
            arr[i] /= N;
            
            if(arr[i] == 2)
            {
                ans[0] = i + 1;
            }
            
            if(arr[i] == 0)
            {
                ans[1] = i + 1;
            }
        }
        
        return ans;
    }
}