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
    public int getDecimalValue(ListNode head) {
        int bin = 0;
        int dec = 0;
        ListNode curr = head;
        while(curr!=null){
            dec = dec<<1;
            dec += curr.val;
            curr = curr.next;
        }
        return dec;
    }
}
