// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String compressString(String text) {
  if(text == null || text.length() == 0) return text;
  
  StringBuilder sb = new StringBuilder();
  int count = 1;
  for(int i=0;i<text.length() - 1;i++){
      char cur = text.charAt(i);
      char next = text.charAt(i + 1);
      if(cur == next) {
          count++;
      } else {
          sb.append(cur);
          if(count > 1) sb.append(String.valueOf(count));
          count = 1;
      }
  }
  
  // append the last character
  sb.append(text.charAt(text.length() - 1));
  if(count > 1) sb.append(String.valueOf(count));

  return sb.toString();
}