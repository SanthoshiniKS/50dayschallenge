class Solution {
    public Node pairwiseSwap(Node head)
    {
        Node curr=head,prev=null;
        while(curr!=null && curr.next!=null)
        {
            Node temp=curr.next;
            curr.next=curr.next.next;
            temp.next=curr;
            if(prev!=null)
                prev.next=temp;
            else 
                head=temp;
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
}
