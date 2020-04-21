//Delete a node from linked list,given access only to that particular node
//method:Since we are given access onlly to the node to be deleted,there is no way of chaning the next of previous element.
//Therefore copy the value of next element into the node to be deleted,and then change the next of present node.

class Delete {
    public void deleteNode(ListNode node) { 
        
        node.val = node.next.val;
        node.next = node.next.next;
        
        
    }
