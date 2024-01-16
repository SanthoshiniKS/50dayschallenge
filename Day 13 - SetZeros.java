class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (!x.contains(i))
                        x.add(i);
                    if (!y.contains(j))
                        y.add(j);
                }
            }
        }
        for (int i = 0; i < x.size(); i++) {
            int ind1 = x.get(i);
            for (int j = 0; j < n; j++)
                matrix[ind1][j] = 0;
        }
        for (int i = 0; i < y.size(); i++) {
            int ind2 = y.get(i);
            for (int k = 0; k < m; k++)
                matrix[k][ind2] = 0;
        }
    }
}
