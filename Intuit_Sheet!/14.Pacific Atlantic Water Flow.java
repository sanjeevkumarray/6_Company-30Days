class Solution {
    private static final int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private boolean isValid(int i, int j, boolean[][] visited) {
        return i >= 0 && i < visited.length && j >= 0 && j < visited[0].length && !visited[i][j];
    }
    private void dfs(int[][] matrix, int i, int j, boolean[][] visited) {
        visited[i][j] = true;
        for(int[] d: dir) {
            int x = i + d[0], y = j + d[1];
            if(isValid(x, y, visited) && matrix[x][y] >= matrix[i][j]) {
                dfs(matrix, x, y, visited);
            }
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        int m = matrix.length, n = m == 0 ? 0 : matrix[0].length;
        boolean[][] pacific = new boolean[m][n], atlantic = new boolean[m][n];
        for(int i = 0; i < m; i++) {
            dfs(matrix, i, 0, pacific);
            dfs(matrix, i, n-1, atlantic);
        }
        for(int i = 0; i < n; i++) {
            dfs(matrix, 0, i, pacific);
            dfs(matrix, m-1, i, atlantic);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }
}