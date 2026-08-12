/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-MIX-A01
Title         : Matrix Diagonal Difference
Historical Status : CONFIRMED
Reported Year(s)  : 2022, 2023, 2024
Topic         : Matrix — Traversal
Difficulty    : EASY-MEDIUM
Accenture Pattern : MEDIUM
Source        : GFG Accenture archive
============================================================
PROBLEM
============================================================
Given an N×N square matrix, compute the absolute difference
between the sum of its primary diagonal (top-left → bottom-right)
and the secondary diagonal (top-right → bottom-left).

Primary diagonal:   mat[i][i]
Secondary diagonal: mat[i][N-1-i]

============================================================
EXAMPLE 1
============================================================
Input:
3 3
11 2 4
4  5 6
10 8 -12

Primary:   11 + 5 + (-12) = 4
Secondary: 4  + 5 + 10    = 19
|4 - 19| = 15

Output: 15
============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(1)
============================================================
*/
import java.util.*;

public class Q01MatrixDiagonalDifference {
    public static int diagonalDiff(int[][] mat, int n) {
        // Write your solution here
        return 0;
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
