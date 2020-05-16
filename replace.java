// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static String replace(String a, String b) {
    StringBuilder sb = new StringBuilder();
    
    for(int i=0;i<a.length();i++) {
        char c = a.charAt(i);
        if(c == ' ') sb.append(b);
        else sb.append(c);
    }
    
    return sb.toString();
}