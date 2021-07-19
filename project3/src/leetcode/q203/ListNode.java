package leetcode.q203;

import linkedlist1.LinkedList;

public class ListNode {
    ListNode next;
    int val;
    public ListNode(int e){
        val = e;
    }
    public ListNode(int[] e){
        this.val = e[0];
        ListNode pre = this;
        for (int i = 1; i < e.length; i++) {
             pre.next = new ListNode(e[i]);
             pre = pre.next;

        }
    }

    @Override
    public String toString() {
            StringBuilder res = new StringBuilder();
            ListNode pre = this;
            while (pre !=null){
                res.append(pre.val).append("->");
                pre = pre.next;
            }
            res.append("NULL");
            return res.toString();
        }
    }
