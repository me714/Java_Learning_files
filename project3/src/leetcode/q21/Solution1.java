package leetcode.q21;


import leetcode.q25.ListNode;

//Ë«Ö¸Õë
public class Solution1 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = new ListNode(4);
        System.out.println(a);

        ListNode b = new ListNode(1);
        b.next = new ListNode(2);
        b.next.next = new ListNode(3);
        b.next.next.next = new ListNode(4);
        System.out.println(b);
        System.out.println(mergeTwoLists(a,b));

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode q = new ListNode(-1);
        ListNode w = q;
        while (l1 != null && l2 != null ){
            if (l1.val > l2.val){
                w.next = new ListNode(l2.val);
                w = w.next;
                l2 = l2.next;
            }else {
                w.next = new ListNode(l1.val);
                w = w.next;
                l1 = l1.next;
            }
        }
        if (l1 != null) {
            w.next = l1;
        }
        if (l2 != null){
            w.next = l2;
        }

        return q.next;
    }
}
