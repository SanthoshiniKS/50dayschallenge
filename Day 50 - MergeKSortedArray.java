class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<K;i++){
            for(int j=0;j<K;j++){
                a.add(arr[i][j]);
            }
        }
        Collections.sort(a);
        return a;
    }
}
