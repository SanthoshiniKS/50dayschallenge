class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    Node temp=head1;
	    HashSet<Integer> set=new HashSet<>();
	    while(temp!=null){
	            set.add(temp.data);
	            temp=temp.next;
	    }
	    temp=head2;
	    while(temp!=null){
	            set.add(temp.data);
	            temp=temp.next;
	    }
	    ArrayList<Integer> arr=new ArrayList<>(set);
	    Collections.sort(arr);
	    Node head=null;
	    for(int i=0;i<arr.size();i++){
	       Node p=new Node(arr.get(i));
	        if(head==null){
	            head=p;
	            temp=head;
	        }
	        else{
	            temp.next=p;
	            temp=p;
	        }
	    }
	    return head;
	}
}
