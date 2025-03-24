package 链表;

/**
 * @author xuantou
 * @description 力扣 206. 反转链表
 *              给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * @date 2025-03-24 10:20
 */
public class ReverseLinkedList_206 {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode cur = new ListNode();
        ListNode pre = new ListNode();
        cur = null;
        pre = null;
        // 循环链表，将下一个节点指向前一个节点，实现链表反转 -> 画图更好理解
        while (head != null) {
            cur = head.next;
            head.next = pre;
            pre = head;
            head = cur;
        }
        return pre;
    }
    
}
