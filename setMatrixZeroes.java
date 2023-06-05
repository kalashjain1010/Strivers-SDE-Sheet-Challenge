import java.util.*;

class  setMatrixZeroes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
    
        System.out.println("enter values of matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        class Solution {
            public void setZeroes(int[][] matrix) {
              int R = matrix.length;
              int C = matrix[0].length;
              Set<Integer> rows = new HashSet<Integer>();
              Set<Integer> cols = new HashSet<Integer>();
          
              // Essentially, we mark the rows and columns that are to be made zero
              for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                  if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                  }
                }
              }
          
              // Iterate over the array once again and using the rows and cols sets, update the elements.
              for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                  if (rows.contains(i) || cols.contains(j)) {
                    matrix[i][j] = 0;
                  }
                }
              }
            }
          }
        

    }
}