class Solution {
    public int climbStairs(int n) {
        int a=1,b=2,t=0;
        if(n==1) 
            return a;
        if(n==2) 
            return b;  
        for(int i=3;i<=n;i++){
            t=a+b;
            a=b;
            b=t;
        }
        return t;
    }
}
