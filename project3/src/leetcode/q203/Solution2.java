package leetcode.q203;

public class Solution2 {
    public ListNode removeElements(ListNode head,int x){
        ListNode hummyNode = new ListNode(-1);
        hummyNode.next = head;
        ListNode pre = hummyNode;
        while (pre.next != null){
            if (pre.next.val==x){
                pre.next = pre.next.next;
            }else {
                pre = pre.next;
            }
        }
        return hummyNode.next;
    }
}
