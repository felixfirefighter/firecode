// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void flipHorizontalAxis(int[][] matrix) {
  int rl = matrix.length - 1;
  int cl = matrix[0].length - 1;
  
  for(int i=0;i<=rl/2;i++) {
      for(int j=0;j<=cl;j++) {
          int temp = matrix[i][j];
          matrix[i][j] = matrix[rl-i][j];
          matrix[rl-i][j] = temp;
      }
  }
}