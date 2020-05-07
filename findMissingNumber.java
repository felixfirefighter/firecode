// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int findMissingNumber(int[] arr) {
  int sumOfArray = 0;
  
  // the formula to sum all number from 1 to N is N(N+1)/2
  int n = arr.length + 1;
  int sumOfNum = n*(n+1)/2;
  
  for(int i = 1; i <= arr.length; i++) {
      sumOfArray += arr[i - 1];
  }
  
  return sumOfNum - sumOfArray;
}