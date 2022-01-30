class Solution {
    public int splitArray(int[] nums, int m) {
        int s = 0;
        int e = 0;
        for(int p:nums){
            s = Math.max(p, s);
            e += p;
        }
            while(s< e){
            int mid = s + (e - s) / 2;
            int sub = 1;
            int sum = 0;
            for(int num : nums){
                if(sum + num > mid){
                      sum = num;
                    sub++;
                }else{
                    sum += num;
                }
            }
            if(sub > m){
                s = mid + 1;
            }else{
                e = mid;
            }
        }
         return e;
    }
}