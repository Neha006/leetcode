class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int countOfNodes=pos( head);
        int position = countOfNodes-n;
        ListNode ans=removeNode(head, position);
        return ans;
    }
    public int pos(ListNode head){
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode removeNode(ListNode head, int pos){
        if(pos==0 && head.next==null)
        {
            head=null;
            return head;
        }
        else if(pos==0 && head.next!=null){
            head=head.next;
            return head;
        }
        ListNode curr=head;
        for(int i=0;i<pos-1;i++){
            curr=curr.next;
        }
         curr.next=curr.next.next; 
        return head;
    }
}
