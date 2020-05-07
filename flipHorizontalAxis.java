// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void flipHorizontalAxis(int[][] matrix) {
  int rowLength = matrix.length - 1;
  
  for(int i = 0; i < matrix.length / 2; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
          int temp = matrix[i][j];
          matrix[i][j] = matrix[rowLength - i][j];
          matrix[rowLength - i][j] = temp;
      } 
  }
}