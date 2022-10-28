import java.util.*;

public class Main {
    public static void main(String[] args) {
        rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        if (n == 1){
            System.out.println(Arrays.deepToString(matrix));
        }else {
            Stack<Integer> stack = new Stack<>();
            for (int i = n-1; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    stack.add(matrix[j][i]);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = stack.pop();
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}