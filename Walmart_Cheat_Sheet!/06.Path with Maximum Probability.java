class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        double[] cost = new double[n];
        cost[start] = 1;
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < edges.length; j++) {
                int[] edge = edges[j];
                double prob = succProb[j];
                cost[edge[1]] = Math.max(cost[edge[1]], cost[edge[0]] * prob);
                cost[edge[0]] = Math.max(cost[edge[0]], cost[edge[1]] * prob);
            }
        return cost[end];
    }
}

