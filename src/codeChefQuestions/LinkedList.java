package codeChefQuestions;

public class LinkedList {

    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void add(int n){

    }
    public static void main(String[] ayn){

    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode first=head;
        ListNode sec = head;
        for(int i=1;i<n;i++){
            first = first.next;
        }
        while(first.next != null){
            first = first.next;
            sec = sec.next;
        }
        if(sec.next != null){
            sec.val = sec.next.val;
            sec.next = sec.next.next;
        }else{
            sec = null;
            first = null;
        }

        return head;

    }
}
