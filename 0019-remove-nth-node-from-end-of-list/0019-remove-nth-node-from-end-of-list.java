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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        if(curr.next==null){
            return null;
        }
        int size=0;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        if(size==n){
            return head.next;
        }
        int index=size-n;
        ListNode pre=head;
        int i=1;
        while(i<index){
            pre=pre.next;
            i++;
        }
        pre.next=pre.next.next;
        return head;
    }
}