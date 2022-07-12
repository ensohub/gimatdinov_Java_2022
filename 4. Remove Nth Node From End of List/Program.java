class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if( head == null )
            return null;
        
        ListNode arr = new ListNode(1);
        arr.next = head;
        
        ListNode p1 = arr;
        ListNode p2 = arr;
        
        for( int i = 0; i < n+1; i++ ){
            p2 = p2.next;
        }
        
        while( p2 != null ){
            p1 = p1.next;
            p2 = p2.next;
        }
        
        p1.next = p1.next.next;
        
        return arr.next;
    }
}