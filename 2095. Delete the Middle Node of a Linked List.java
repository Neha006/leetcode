class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode curr=head;
        int idx=0;
        while(curr!=null){
            curr=curr.next;
            idx++;
        }
        int mid=(idx/2);
        deleteMid(head,mid);
        return head;
    }

    public void deleteMid(ListNode head, int pos){
        ListNode curr=head;
        for(int i=0;i<pos-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
    }
}
