
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode newList = removeElements(head.next, val);
            if (head.val == val) return newList;
            else head.next = newList;
            return head;     
    }
}