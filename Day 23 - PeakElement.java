class Solution
{
   public int peakElement(int[] arr,int n)
   {
       int index=0;
       for(int i=0;i<n-1;i++){
           if(arr[i]<arr[i+1])
               index=i+1;
           else
               break;
       }
       return index;
    }
}
