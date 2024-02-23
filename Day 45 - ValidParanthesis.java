class Solution{
    static int maxLength(String S){
        // code here
        Stack<Integer> s=new Stack<>();
        s.push(-1);
        int max=0;
        for(int i=0;i<S.length();i++){
          char ch=S.charAt(i);
          if(ch=='(')
            s.push(i);
          else{
            s.pop();
            if(s.empty())
              s.push(i);
            else{
               int len=i-s.peek();
               max=Math.max(len,max);
            }
          }
        }
        return max;
    }
}￼Enter
