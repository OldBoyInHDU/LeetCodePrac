package LeetCodePrac;

public class P21_MergeTwoSortedLists {
    //将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
// 示例：
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
//
// Related Topics 链表



//leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            //创建一个新的链表
            //每一次迭代，比较哪个小，小的放入
            //要定义一个头节点，head.next就是需要返回的链表
            //定义一个哨兵，用来迭代。
            ListNode head = new ListNode(0);
            ListNode list = head;

            //要先判断当前是否为null，当前弄完后再考虑next是否为null
            while(l1 != null && l2 != null) {
                if(l1.val <= l2.val) {
                     list.next = l1;
                    l1 = l1.next;
                } else {
                     list.next = l2;
                    l2 = l2.next;
                }

                list = list.next;
            }
            if(l1 == null) {
                //如果l1是null了，说明l2还有，l1和l2不可能同时null
                list.next = l2;
            } else {
                //如果l1还有，说明l2null了
                list.next = l1;
            }
            return head.next;
        }
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)
}
