class Solution {
         public int longestMountain(int[] A) {
     int res = 0, currentLength = 0;
     Boolean  b = null;
     for(int i=1;i<A.length;i++)
         if(A[i-1] < A[i]) {
             if(b == null || !b) {
                 b = true;
                 currentLength = 1;
             }
             currentLength++;
         } else if(A[i-1] > A[i] && b != null) {
             b = false;
             currentLength++;
             res = Math.max(res, currentLength);
         } else  b = null;
     return res;
 }
         
     }
 