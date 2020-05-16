// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode insertAtHead(ListNode head, int data) {
  ListNode node = new ListNode(data);
  
  if(head == null) return node;
          
  node.next = head;
  return node;
}