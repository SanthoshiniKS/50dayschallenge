class Solution {
    static int getLastDigit(String a, String b) {
        if(a.length()==1 && b.length()==1 && b.charAt(0)=='0' && a.charAt(0)=='0')
            return 1;
        if(b.length()==1 && b.charAt(0)=='0')
            return 1;
        if(a.length()==1 && a.charAt(0)=='0')
            return 0;
        int exp=0;
        for(int i=0;i<b.length();i++)
            exp=(exp*10+b.charAt(i)-'0')%4;
        if(exp==0)
           exp=4;
        int base=a.charAt(a.length()-1)-'0';
        int res=(int)Math.pow(base,exp);
        return res%10;
    }
};
