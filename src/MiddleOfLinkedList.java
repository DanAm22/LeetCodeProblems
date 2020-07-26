public class MiddleOfLinkedList {

    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode firstPointer = head;
            ListNode secondPointer = head;
            while (secondPointer != null && secondPointer.next != null) {
                firstPointer = firstPointer.next;
                secondPointer = secondPointer.next.next;
            }
            return firstPointer;
        }
    }
}
