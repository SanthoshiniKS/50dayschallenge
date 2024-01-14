class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
       int last=0;
       for(int i=1;i<intervals.length;i++){
            if(intervals[last][1]>=intervals[i][0])
               intervals[last][1]=Math.max(intervals[last][1],intervals[i][1]);
            else
                intervals[++last]=intervals[i];
       }
       return Arrays.copyOf(intervals,last+1);
    }
}
