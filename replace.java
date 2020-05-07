// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String replace(String a, String b) {
  StringBuilder sb = new StringBuilder();
  
  for(int i=0;i<a.length();i++) {
      if(a.charAt(i) == ' ') {
          sb.append(b);
      } else {
          sb.append(a.charAt(i));
      }
  }
  
  return sb.toString();
}