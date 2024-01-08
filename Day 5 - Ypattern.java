class Solution {
    static String[] yShapedPattern(int N) {
        String[] pattern=new String[N];
        for (int i=0;i<N;i++){
            String s="";
            for(int j=0;j<=N;j++){
                if(i<N/2){
                    if(j==i || j==N-i)
                        s+="*";
                    else
                        s+=" ";
                }
                else{
                    if(j==N/2)
                      s+="*";
                    else
                      s+=" ";
                }   
            }
            pattern[i]=s;
        }
        return pattern;
    }
};
