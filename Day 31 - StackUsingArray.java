class twoStacks
{
    int arr[];
    int n=100,top1,top2;
    twoStacks()
    {
        arr=new int[n];
        top1=-1;
        top2=n;
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
        arr[++top1]=x;
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
       arr[--top2]=x;
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(top1==-1)
           return -1;
        else
           return arr[top1--];
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(top2==n)
           return -1;
        else
           return arr[top2++];
    }
}
