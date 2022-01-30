class Solution {
    public int numberOfBoomerangs(int[][] points) {
    Map<Integer, Integer> hm = new HashMap<>();
    int n = points.length;
    int sum = 0;        
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
        {
            if(i==j) continue;
            int x = points[i][0] - points[j][0];
            int y = points[i][1] - points[j][1];
            int mul = x*x + y*y;
            hm.put(mul, hm.getOrDefault(mul, 0) + 1);
        }
        
        for(int cnt : hm.values())
        {
            if(cnt >= 2)
            {
                sum += cnt*(cnt-1);
            }
        }
        
        hm.clear();
    }
    return sum;
}
    }
