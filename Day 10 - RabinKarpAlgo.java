class Solution{ 
    ArrayList<Integer> search(String pat, String S)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<=S.length()-pat.length();i++)
        {
            if((S.substring(i,i+pat.length())).equals(pat))
                 arr.add(i+1);
        }
        if(arr.size()==0)
            arr.add(-1);
        return arr;
    }
}
