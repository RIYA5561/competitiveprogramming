package leetcode;

public class ques206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null,next = null,curr = head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
    

