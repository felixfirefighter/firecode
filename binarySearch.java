// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static Boolean binarySearch(int[] arr, int n){
  int l = 0, r = arr.length - 1;
  
  while(l <= r){
      int mid = (l + r) / 2;
      
      if(arr[mid] == n)
          return true;
      
      // n is greater than mid
      // ignore the left side of the array
      if(arr[mid] < n){
          l = mid + 1;
      }
      // n is smaller than mid
      // ignore the right side of the array
      else {
          r = mid - 1;
      }
  }
  
  return false;
}