// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtTail(ListNode head) {
  if(head == null || head.next == null) return null;
  
  ListNode node = head;
  
  while(node.next.next != null) {
      node = node.next;
  }

  node.next = null;
  return head;
}