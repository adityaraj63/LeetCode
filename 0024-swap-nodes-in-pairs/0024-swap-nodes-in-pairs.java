
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            int val = temp.val;
            temp.val = temp.next.val;
            temp.next.val = val;

            temp = temp.next.next;
        }
        return head;
    }
}