class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		int arr[]=new int[s.size()];
	    for(int i=0;i<s.size();i++)
		{
		    arr[i]=s.get(i);
		}
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=i+1;j<arr.length;j++)
		    {
		        if(arr[i]>arr[j])
		        {
		            int temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		        }
		    }
		}
		Stack<Integer> r=new Stack<>();
		for(int i=0;i<s.size();i++)
		    r.add(arr[i]);
		return r;
	}
}
