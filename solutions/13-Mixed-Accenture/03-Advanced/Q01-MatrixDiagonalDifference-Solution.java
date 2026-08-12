/*
SOLUTION: ACC-MIX-A01 — Matrix Diagonal Difference (CONFIRMED)
*/
import java.util.*;

public class Q01MatrixDiagonalDifferenceSolution {
    public static int diagonalDiff(int[][] mat, int n) {
        long primary = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            primary += mat[i][i];
            secondary += mat[i][n - 1 - i];
        }
        return (int) Math.abs(primary - secondary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) mat[i][j] = sc.nextInt();
        System.out.println(diagonalDiff(mat, n));
    }
}
