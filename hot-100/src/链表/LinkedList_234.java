package 链表;

/**
 * @author xuantou
 * @description 力扣 234. 回文链表
 *              给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 * @date 2025-03-25 23:44
 */

/**
 * 题解思路：
 * 1. 使用快慢指针，快指针一次走两步，慢指针一次走两步。快指针到达链表末尾时，慢指针刚好指向链表的中间节点。
 * 2. 将链表的后半部分反转，然后比较前半部分和后半部分是否相同。
 */
public class LinkedList_234 {

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

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode head2 = reverseList(mid);
        while (head2 != null) {
            if (head.val != head2.val) {
                return false;
            }
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }

    // 反转链表
    private ListNode reverseList(ListNode head) {
        ListNode cur = new ListNode();
        ListNode pre = new ListNode();
        cur = null;
        pre = null;
        while (head != null) {
            cur = head.next;
            head.next = pre;
            pre = head;
            head = cur;
        }
        return pre;
    }

    // 链表的中间节点
    private ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
