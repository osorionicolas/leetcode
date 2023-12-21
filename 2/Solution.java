package ex2;

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
    int total = 0;
    ListNode response;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return walk(l1, l2, 0);
    }

    public ListNode walk(ListNode l1, ListNode l2, int previous) {
        if(l1 == null) l1 = new ListNode(0);
        if(l2 == null) l2 = new ListNode(0);
        int total = l1.val + l2.val + previous;
        int base = total / 10;
        int value = total % 10;
        if(l1.next != null || l2.next != null) {
            ListNode current = new ListNode(value);
            current.next = walk(l1.next, l2.next, base);
            return current;
        }
        return total >= 10 ? new ListNode(value, new ListNode(base)) : new ListNode(total);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}