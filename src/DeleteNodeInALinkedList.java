public class DeleteNodeInALinkedList {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static class Solution {
        public void deleteNode(ListNode node) {
            if (node.next == null) {
                return;
            }
            ListNode current = node;
            ListNode prev = null;
            while (current.next != null) {
                current.val = current.next.val;
                prev = current;
                current = current.next;
            }
            prev.next = null;
        }
    }
}

