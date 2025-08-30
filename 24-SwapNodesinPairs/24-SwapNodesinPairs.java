// Last updated: 8/30/2025, 2:08:40 PM
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
    public ListNode swapPairs(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        ListNode temp  = head;
        ListNode kth = null;
        while(temp != null){
            kth =temp.next;
            if(kth == null){
                if(pre != null) pre.next = temp;
                break;
            }

            next = kth.next;
            kth.next = null;
            reverse(temp);
            if(temp == head) head = kth;
            else pre.next = kth;

            pre = temp;
            temp = next;
        }
        return head;
    }

    public void reverse(ListNode head){
        ListNode pre= null;
        ListNode temp = head;
        while(temp != null){
            ListNode curr = temp.next;
            temp.next = pre;
            pre = temp;
            temp = curr;
        }
    }
}