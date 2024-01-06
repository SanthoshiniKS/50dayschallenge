class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int x=n,sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(x==sum)
           return "Yes";
        return "No";
    }
}
