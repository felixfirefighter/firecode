// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void flipItVerticalAxis(int[][] matrix) {
    int colLength = matrix[0].length - 1;
    for(int i = 0;i < matrix.length; i++) {
        for(int j = 0;j < colLength; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][colLength - j];
            matrix[i][colLength - j] = temp;
        }
    }
}