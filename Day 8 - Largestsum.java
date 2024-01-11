class Solution{
    long maxSubarraySum(int arr[], int n){
        long c=arr[0];
        long max=arr[0];
        for(int i=1;i<n;i++){
            if(c<0)
               c=arr[i];
            else
              c+=arr[i];
            max=Math.max(max,c);
        }
        return max;
    }
}
