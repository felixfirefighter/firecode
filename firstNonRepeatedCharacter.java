// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.
public static Character firstNonRepeatedCharacter(String str) {
  HashMap<Character, Integer> characterMap = new HashMap<Character, Integer>();
  
  for(int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      characterMap.put(c, characterMap.getOrDefault(c, 0) + 1);
  }
  
  for(int i  = 0; i < str.length(); i++) {
      if(characterMap.get(str.charAt(i)) == 1) {
          return str.charAt(i);
      }
  }
  
  return null;
}

