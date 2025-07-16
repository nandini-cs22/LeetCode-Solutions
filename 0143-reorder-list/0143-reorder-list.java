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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        Stack<ListNode> st = new Stack<>();
        ListNode dummy = head;
        while(dummy != null){
            st.push(dummy);
            dummy = dummy.next;
        }
        dummy = head;
        int n = st.size()/2;
        for(int i =0;i<n;i++){
            ListNode right = st.pop();
            ListNode left = dummy.next;
            dummy.next = right;
            right.next = left;
            dummy = left;
        }
        if(dummy != null) dummy.next = null;
    }
}