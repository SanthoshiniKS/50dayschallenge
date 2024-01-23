class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        ArrayList<Long> arr=new ArrayList<>();
        long mod=1000000007;
        long a=1;
        arr.add(a);
        if(n==1)
            return arr;
        ArrayList<Long> prev=nthRowOfPascalTriangle(n-1);
        for(int i=1;i<prev.size();i++){
            long temp=(prev.get(i-1)+prev.get(i))%mod;
            arr.add(temp);
        }
        arr.add(a);
        return arr;
    }
}
