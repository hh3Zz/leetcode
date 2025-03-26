package 链表;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xuantou
 * @description 力扣 141. 环形链表
 *              给你一个链表的头节点 head ，判断链表中是否有环。
 * @date 2025-03-26 19:55
 */

/**
 * 题解思路：
 * 使用set集合，遍历链表时将每次遍历到的节点放入set集合中，如果集合中已经存在该节点，则说明链表中存在环。
 */
public class CycleLinkedList_141 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> hashset = new HashSet<ListNode>();
        while (head != null) {
            if (!hashset.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

}
