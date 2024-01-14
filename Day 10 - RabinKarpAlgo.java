class Solution
{
    ArrayList<Integer> search(String pat, String S)
    {
        // your code here
        ArrayList<Integer> arr=new ArrayList<>();
        int ind[]=new int[S.length()];
        for(int i=0;i<S.length();i++){
          if(S.charAt(i)==pat.charAt(0))
              ind[i]=1;
          }
        for(int i=0;i<S.length();i++){
          if(ind[i]==1){
              if(i+pat.length()-1<S.length() && S.substring(i,i+pat.length()).equals(pat))
                 arr.add(i+1);
          }
        }
        if(arr.isEmpty())
            arr.add(-1);
        return arr;
    }
}
