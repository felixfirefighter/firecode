// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public Boolean isListEven(ListNode head) {
  if(head == null) return true;

  // jump twice whenever next or next.next is not null
  // it means we jump as followed 1 -> 3 -> 5 -> 7
  while(head.next != null && head.next.next != null) {
      head = head.next.next;
  }
  
  // as head will always stay on odd position, if head.next 
  // is not null, then the length of list is even
  return head.next != null;
}