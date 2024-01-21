class Solution {
    static int nthFibonacci(int n){
       int m=1000000007;
        int a=0,b=1;
        for (int i=2;i<=n;i++) {
            int c=(a+b)%m;
            a=b;
            b=c;
        }
        return b;
    }
}
