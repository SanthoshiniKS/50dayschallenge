public class Solution {
	public static long firstOne()
	{
        long low=0;
        long high=1;
        while(Runner.get(high)==0){
            low=high;
            high*=2;
        }
        while(low<high){
            long mid=low+(high-low)/2;
            if (Runner.get(mid)==1)
                high=mid;
            else
                low=mid+1;
        }
        return high;
    }

}
