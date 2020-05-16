// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isIsomorphic(String input1, String input2) {
  if((input1 == null || input2 == null)) return true;
  if(input1.length() != input2.length()) return false;
  
  Hashtable<Character, Integer> table1 = new Hashtable<Character, Integer>();
  Hashtable<Character, Integer> table2 = new Hashtable<Character, Integer>();
  
  for(int i=0;i<input1.length();i++) {
      char c1 = input1.charAt(i);
      char c2 = input2.charAt(i);
      
      int count1 = table1.getOrDefault(c1, 0) + 1;
      table1.put(c1, count1);
      
      int count2 = table2.getOrDefault(c2, 0) + 1;
      table2.put(c2, count2);
      
      if(count1 != count2) return false;
  }
  
  return true;
}