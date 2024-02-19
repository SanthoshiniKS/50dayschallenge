class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        int res[]=new int[k];
        int j=0;
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            if(j<k){
                res[j]=arr[i];
                j++;
            }
            else
              break;
        }
        return res;
    }
}
