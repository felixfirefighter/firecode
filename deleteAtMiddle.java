// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtMiddle(ListNode head, int position) {
  if(head == null) return head;
  
  // if head needs to be deleted
  if(position == 1) { 
      return head.next;
  }
  
  ListNode prev = head;
  
  // find prev node of the node to be deleted
  for(int i=1;i<position-1;i++) {
      if(prev == null || prev.next == null) return head;
      prev = prev.next;
  }
  
  prev.next = prev.next.next;
  
  return head;
}