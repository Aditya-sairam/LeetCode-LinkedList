//Check if a linked list is palindrome or not-Using stack

class Palin {
    public boolean isPalindrome(ListNode head) {
        boolean ispalin = true;
        ListNode slow_ptr = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(slow_ptr != null){
            stack.push(slow_ptr.val);
            slow_ptr = slow_ptr.next;
        }
        while(head != null){
            int i = stack.pop();
            if(head.val == i){
                ispalin = true;
                
            }
            else{
                ispalin=false;
                break;
            }
            head = head.next;
        }
        return ispalin;
        
}
}
