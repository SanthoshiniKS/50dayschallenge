class Solution {
    public int nthUglyNumber(int n) {
        int dp[]=new int[n+1];
        int d2=1,d3=1,d5=1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            int m2=dp[d2]*2;
            int m3=dp[d3]*3;
            int m5=dp[d5]*5;
            int min=Math.min(m2,Math.min(m3,m5));
            dp[i]=min;
            if(min==m2) d2++;
            if(min==m3) d3++;
            if(min==m5) d5++;
        }
        return dp[n];
    }
}
