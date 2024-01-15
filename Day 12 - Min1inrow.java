class Solution {
    int minRow(int N, int M, int A[][]) {
        int c=0,min=M,index=0;
        for(int i=0;i<N;i++){
            c=0;
            for(int j=0;j<M;j++){
                if(A[i][j]==1)
                    c++;
            }
            if(c==0) 
               return i+1;
            if(c<min){
                min=c;
                index=i+1;
            }
        }
        return index;
    }
};
