class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
           return dividend/divisor;
       // while(dividend % divisor!=0){
                //int rem =dividend%divisor;
                //dividend =divisor;
                //divisor=rem;
      
       // }
         //return dividend;
    }
}