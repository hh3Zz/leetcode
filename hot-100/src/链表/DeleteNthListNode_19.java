package 链表;

/**
 * @author xuantou
 * @description 力扣19. 删除链表中倒数第n个节点
 *              给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * @date 2025-03-26 21:04
 */

/**
 * 题解思路：
 * 快慢指针：先将快指针移动n个位置，然后快慢指针一起移动，当快指针到达链表末尾时，慢指针指向的节点就是倒数第n个节点的前一个节点，
 * 注意：因为要删除该节点，所以要移动到该节点的前一个才能删除，所以循环结束条件为 start.next != null
 */
public class DeleteNthListNode_19 {

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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode start = pre, end = pre;
        while (n != 0) {
            start = start.next;
            n--;
        }
        while (start.next != null) {
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;
    }
    
}
