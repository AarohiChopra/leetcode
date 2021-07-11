
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> s = new Stack<ListNode>();
        ListNode curr = head;
        while(curr!=null)
        {
            s.push(curr);
            curr = curr.next;
        }
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        while(s.isEmpty()!=true)
        {
            temp.next = new ListNode(s.pop().val);
            temp = temp.next;
        }
        return res.next;
    }
}