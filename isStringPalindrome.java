// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static boolean isStringPalindrome(String str){
    if(str == null || str.length() == 0) return true;
    
    int lastIndex = str.length() - 1;
    
    for(int i = 0; i <= lastIndex / 2; i++) {
        
        char start = str.charAt(i);
        char end = str.charAt(lastIndex - i);
        if(start != end) {
            return false;
        }
    }
    
    return true;
}