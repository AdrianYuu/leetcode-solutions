/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head.next;

        while(slowPtr != fastPtr){
            if(fastPtr.next == null || fastPtr.next.next == null){
                return false;
            }

            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return true;
    }
}