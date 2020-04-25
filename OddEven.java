//Arrange the linked list nodes with odd number first and then even numbers.
//here nodes are not arranged according to the values but they are arranged according to the node number(places)

class OddEven {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode odd = head;
        ListNode even=head.next;
        ListNode evenHead = even;
        
        
        
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
     
        return head;
    }
}
