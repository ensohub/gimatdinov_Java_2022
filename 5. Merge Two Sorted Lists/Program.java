public class Solution {
    public ListNode mergeTwoLists(ListNode flist, ListNode slist) {
        if( slist == null ) return flist;
        if( flist == null ) return slist;
        if( flist.val < slist.val ){
            flist.next = mergeTwoLists( flist.next, slist );
            return flist;
        }
        slist.next = mergeTwoLists( flist, slist.next );
        return slist;
    }
}