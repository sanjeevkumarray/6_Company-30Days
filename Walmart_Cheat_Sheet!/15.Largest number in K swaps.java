class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            String str = sc.next();
            Res r = new Res();
            r.max = str;
            new Solution().findMaximumNum(str.toCharArray(), k, r);
            System.out.println(r.max);
        }
    }
}// } Driver Code Ends


class Solution {
    // function to find maximum integer possible by
    // doing at-most K swap operations on its digits
    static void findMaximumNum(char ar[], int k1, Res r) {
        if(k1==0)
            return;
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]<ar[j]){
                    swap(i,j,ar);
                    String s=new String(ar);
                    
                    if(r.max.compareTo(s)<0)
                        r.max=s;
                    findMaximumNum(ar,k1-1,r);
                    swap(i,j,ar);
                }
            }
        }
    }
    static void swap(int i,int j,char ar[]){
                    char cf=ar[i];
                    ar[i]=ar[j];
                    ar[j]=cf;
    }
        
}