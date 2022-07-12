public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode h = head;
        while( h != null ){
            if( h.next != null && h.val == h.next.val ){
                h.next = h.next.next;
            }else{
                h = h.next;
            }
        }
        return head;
    }
}