public class Shanchu {
    public static void main(String[] args) {
        ListNode head=new ListNode(3,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(5)))));



        ListNode g= deleteDuplicates(head);
        while(g!=null){
            System.out.print(g.val+" ");
            g=g.next;
        }



}public  static ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode o=head;
        while(o.next!=null){
            if(o.next.val==o.val){
                o.next=o.next.next;
            }else {
                o=o.next;

            }

        }return head;


    }
public static  class ListNode {
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
}}