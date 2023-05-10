public class Youshulianbiao {



    public static void main(String[] args) {

        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(3)));
      ListNode l2=new ListNode(2,new ListNode(3,new ListNode(6)));
        ListNode g=fghj(l1,l2);
        while(g!=null){
            System.out.print(g.val+"");
            g=g.next;
        }

    }



    public static ListNode fghj(ListNode l1, ListNode l2) {
        ListNode k = new ListNode(-1);
        ListNode l = k;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                l.next = l1;
                l1 = l1.next;

            } else {
                l.next = l2;
                l2 = l2.next;

            }
            l = l.next;
        }
        l.next = l1 == null ? l2 : l1; return k.next;
    }public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
