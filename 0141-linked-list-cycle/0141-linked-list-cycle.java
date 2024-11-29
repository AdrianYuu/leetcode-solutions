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
        if(head == null){
            return false;
        }

        HashMap<ListNode, Boolean> hashMap = new HashMap<>();

        while(head != null){
            if(hashMap.containsKey(head) && hashMap.get(head) == true){
                return true;
            }

            hashMap.put(head, true);
            head = head.next;
        }

        return false;
    }
}