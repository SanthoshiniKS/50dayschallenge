class Solution{
    ArrayList<Integer> arr=new ArrayList<>();
    public List<Integer> pattern(int N){
        if(N<=0){
            arr.add(N);
            return arr;
        }
        arr.add(N);
        pattern(N-5);
        arr.add(N);
        return arr;
    }
}
