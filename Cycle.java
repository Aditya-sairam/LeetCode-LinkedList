public class Cycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNode seeker = head;
                while(seeker != slow){
                    seeker = seeker.next;
                    slow = slow.next;
                }
            return slow;
            }
        }
        return null;
        
    }

}
