public class RotateList {

    // Definition for singly-linked list.
    public class ListNode {
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
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null) return head;

            int length = 0;
            ListNode node = head;
            while (node != null) {
                node = node.next;
                length++;
            }
            k = k % length;

            ListNode firstpart, lastpart;
            lastpart = head;
            for (int i = 1; i < length - k; i++) {
                head = head.next;
            }

            firstpart = head.next;
            head.next = null;

            if (firstpart == null) {
                return lastpart;
            }
            node = firstpart;
            while (node.next != null) {
                node = node.next;
            }
            node.next = lastpart;

            return firstpart;
        }
    }
}
