class Solution {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int l=1,r=stalls[n-1]-stalls[0];
        while(l<=r){
            int mid=(l+r)/2;
            if(place_cows(mid,stalls,k)) 
                l=mid+1;
            else 
                r=mid-1;
        }
        return r;
    }
    public static boolean place_cows(int dis,int[] stalls,int k){
        int last=stalls[0],cowsCount=1;
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last>=dis){
                last=stalls[i];
                cowsCount++;
            }
        }
        return cowsCount>=k;
    }
}
