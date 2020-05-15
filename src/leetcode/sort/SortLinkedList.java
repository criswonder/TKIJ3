package sort;

/**
 * 使用插入排序对一个链表进行排序
 */
public class SortLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        @Override
        public String toString() {
            return val + ",next=" + (next == null ? "null" : "" + next.val);
        }
    }

    public static class Solution {
        public ListNode insertionSortList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode newHead = new ListNode(-1);

            newHead.next = head;

            ListNode p = head;
            ListNode c = head.next;
            ListNode n = c.next;
            while (c != null) {
                ListNode p1 = newHead;
                ListNode c1 = newHead.next;

                boolean inserted = false;//是否需要交换p 和c
                while (c1 != null && c1 != c) {

                    if (c1.val > c.val) {
//                        if (c1.next.equals(c)) {
//
//                        }
                        inserted = true;

                        //更新c的前后节点
                        p.next = c.next;

                        //插入c
                        p1.next = c;
                        c.next = c1;
                        break;
                    }
                    p1 = c1;
                    c1 = c1.next;
                }

                //待插入的元素往下一个
                if (inserted) {
                    p = p;
                } else {
                    p = c;
                }

                c = n;
                if (n != null) {
                    n = n.next;
                }
            }

            return newHead.next;
        }
    }

    public static void main(String[] args) {
//        test1();
        test3();
    }

    private static void test1() {
        ListNode listNode = new ListNode(3);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(5);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(1);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        Solution solution = new Solution();
        final ListNode sortedList = solution.insertionSortList(listNode);

        printLinkedList(sortedList);
    }

    private static void test2() {
        ListNode listNode = new ListNode(3);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(5);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(9);
        ListNode listNode5 = new ListNode(1);
        ListNode listNode6 = new ListNode(3);
        ListNode listNode7 = new ListNode(7);
        ListNode listNode8 = new ListNode(6);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;

        Solution solution = new Solution();
        final ListNode sortedList = solution.insertionSortList(listNode);

        printLinkedList(sortedList);
    }

    private static void test3() {
        ListNode listNode = new ListNode(3);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(5);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(9);
        ListNode listNode5 = new ListNode(1);
        ListNode listNode6 = new ListNode(3);
        ListNode listNode7 = new ListNode(7);
        ListNode listNode8 = new ListNode(6);
        ListNode listNode9 = new ListNode(8);
        ListNode listNode10 = new ListNode(6);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode9;
        listNode9.next = listNode10;

        Solution solution = new Solution();
        final ListNode sortedList = solution.insertionSortList(listNode);

        printLinkedList(sortedList);
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
