class Solution {
    int[][] rotateMatrix(int N, int M, int K, int Mat[][]) {
        int res[][]=new int[N][M];
        K=K%M;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                int temp=(K+j)%M;;
                res[i][j]=Mat[i][temp];
            }
        }
        return res;
    }
};
