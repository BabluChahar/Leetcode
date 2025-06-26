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
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode next;
        ListNode curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;

        }
        return pre;
    }
    public ListNode findmiddle(ListNode head){
        ListNode rab=head;
        ListNode tur=head;
        while(rab.next!=null && rab.next.next!=null){
            rab=rab.next.next;
            tur=tur.next;
        }
        return tur;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode middle=findmiddle(head);
        ListNode sechalffirst=reverse(middle.next);
        ListNode firststart=head;
        while(sechalffirst!=null){
            if(firststart.val!=sechalffirst.val){
                return false;
            }
            firststart=firststart.next;
            sechalffirst=sechalffirst.next;
        }
return true;
        
    }
}