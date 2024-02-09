class Solution {
    public int findPairs(int[] nums, int k) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    Collections.sort(temp);
                    if(!arr.contains(temp))
                        arr.add(temp);
                }
            }
        }
        System.out.println(arr);
        return arr.size();
    }
}
