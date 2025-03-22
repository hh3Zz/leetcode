package 链表;

/**
 * @author xuantou
 * @description 力扣160题 相交链表
 *              给你两个单链表的头节点 headA 和 headB ，
 *              请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 * @date 2025-03-22 13:56
 */

/**
 * 题解思路：
 * 定义两个指针 pA, pB，分别指向 链表A 和 链表B 的头结点，然后通过两个指针同时遍历 链表A 和 链表B，
 * 当 pA 走到 链表A 的尾部时，将 pA 指向链表B 的头结点，当 pB 走到 链表B 的尾部时，将 pB 指向链表A 的头结点。
 * 当 pA 和 pB 相遇时，两个指针走过的节点书数相同，停止遍历，返回 pA 或 pB 。
 */
public class IntersectLinkList_160 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

}
