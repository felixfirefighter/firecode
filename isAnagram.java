// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isAnagram(String input1, String input2) {
  int[] buffer = new int[256];
  
  if((input1 == null || input2 == null) || (input1.length() != input2.length())) return false;
  
  for(int i = 0;i < input1.length();i++) {
      int a = input1.charAt(i) - 'a';
      int b = input2.charAt(i) - 'a';
      buffer[a]++;
      buffer[b]--;
  }
  
  for(int index : buffer) {
      if(index != 0) return false;
  }
  
  return true;
}