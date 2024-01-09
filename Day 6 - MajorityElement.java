class Solution {
    public int majorityElement(int[] nums) {
        int c=1,max=0,i=0;
        if(nums.length==1) return nums[i];
        Arrays.sort(nums);
        for(i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                c++;
            else{
                if(c>nums.length/2)
                    max=nums[i];
                c=1;
            }
        }
        if(c>nums.length/2)
            max=nums[i];
        return max;
    }
}
