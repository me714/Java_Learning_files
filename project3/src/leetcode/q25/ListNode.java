package leetcode.q25;

public class ListNode {
    public int val;
    public ListNode next;
    ListNode() {}
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode dummyHead = new ListNode(-1,this);
        ListNode cur = dummyHead.next;
        while (cur !=null){
            res.append(cur.val).append("->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
