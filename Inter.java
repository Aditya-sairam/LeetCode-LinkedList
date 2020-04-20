//Intersection of two linkedlist using Hash set

public class Inter {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode>nodes = new HashSet<>();
        ListNode pa = headA;
        ListNode pb = headB;
        
        while(pa != null){
            nodes.add(pa);
            pa = pa.next;
        }
        if(nodes.isEmpty()){
            return null;
        }
        while(pb != null){
            if(nodes.contains(pb)){
                return pb;
            }
            pb = pb.next;
        }
        
        return null;
    }
}
