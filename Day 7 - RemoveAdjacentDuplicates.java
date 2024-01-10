class Solution {
    public String removeDuplicates(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            int j=res.length();
            if(j>0 && res.charAt(j-1)==s.charAt(i))
                res=res.substring(0,j-1);
            else
                res+=s.charAt(i);
        }

        return res;
    }
}
