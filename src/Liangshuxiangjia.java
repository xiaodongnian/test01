public class Liangshuxiangjia {
    public static class ListNode {
        int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {
        Liangshuxiangjia liangshuxiangjia=new Liangshuxiangjia();
        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode l2=new ListNode(8,new ListNode(9,new ListNode(1)));
        ListNode o=liangshuxiangjia.addTwoNumbers(l1,l2);
        while(o!=null){
            System.out.print(o.val);
            o=o.next;
        }

    }public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a=new ListNode(0);
        ListNode b=a;
        int count=0;
        int sum=0;
        while(l1!=null||l2!=null){
            int x=l2!=null? l2.val : 0;
            int y=l1!=null? l1.val : 0;
            sum=x+y+count;
            count=sum/10;
            b.next=new ListNode(sum%10);
            b=b.next;
            if(l1!=null){
                l1=l1.next;

            }if(l2!=null){
                l2=l2.next;
            }

        }if(count>0){
        b.next=new ListNode(count);}
        return a.next;

    }
}