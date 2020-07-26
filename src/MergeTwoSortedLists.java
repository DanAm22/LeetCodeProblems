public class MergeTwoSortedLists {

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
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(0);
            ListNode it = head;
            if (l1 == null) {
                return l2;
            } else if (l2 == null) {
                return l1;
            }
            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    it.next = l1;
                    l1 = l1.next;
                } else {
                    it.next = l2;
                    l2 = l2.next;
                }
                it = it.next;
            }
            if (l1 != null) {
                it.next = l1;
            } else if (l2 != null) {
                it.next = l2;
            }
            return head.next;
        }
    }
}
