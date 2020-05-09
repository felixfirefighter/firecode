// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean areAllCharactersUnique(String str){
  if(str == null || str.length() == 0) return true;
  
  boolean[] buffer = new boolean[256];
  for(int i = 0;i < str.length();i++) {
      if(buffer[str.charAt(i)]) return false;
      
      buffer[str.charAt(i)] = true;
  }
  
  return true;

}