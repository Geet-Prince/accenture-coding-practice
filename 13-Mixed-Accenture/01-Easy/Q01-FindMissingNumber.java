/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-MIX-E01
Title         : Find Missing Number in Array
Historical Status : CONFIRMED
Reported Year(s)  : 2022, 2023, 2024
Topic         : Arrays — Math
Difficulty    : EASY
Accenture Pattern : HIGH
Source        : GFG Accenture archive, PrepInsta
============================================================
PROBLEM
============================================================
Given an array of (N-1) DISTINCT integers in the range [1, N],
find the ONE missing integer.

============================================================
EXAMPLE 1
============================================================
Input: N=5, arr=[1, 2, 4, 5]
Expected sum of 1..5 = 15
Actual sum = 12
Missing = 15 - 12 = 3
Output: 3

============================================================
EDGE CASES
============================================================
1. Missing number is 1
2. Missing number is N (last)
3. Use long for large N to avoid sum overflow
============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(1)
============================================================
*/
import java.util.*;

public class Q01FindMissingNumber {
    public static int findMissing(int[] arr, int n) {
        // Write your solution here
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) arr[i] = sc.nextInt();
        System.out.println(findMissing(arr, n));
    }
}
