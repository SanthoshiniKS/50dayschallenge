class Solution
{
    Node reverseList(Node head)
    {
        Node cur=head,prev=null,temp=head;
        while(temp!=null){
            temp=temp.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        head=prev;
        return head;
    }
}
