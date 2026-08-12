/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-ARR-H02
Title         : Product of Smallest Pair
Historical Status : CONFIRMED
Reported Year(s)  : 2020, 2023, 2025
Topic         : Arrays — Sorting
Difficulty    : EASY
Accenture Pattern : HIGH
Source        : PrepInsta, GFG 2020 logs
============================================================
PROBLEM
============================================================
Write a function ProductSmallestPair(sum, arr) that accepts:
  - sum : target sum (integer)
  - arr : integer array of size n

Find the TWO SMALLEST elements in arr.
If their sum <= sum, return their PRODUCT.
Otherwise return 0.

Special returns:
  - Return -1 if n < 2 or array is null

============================================================
INPUT
============================================================
Line 1: sum (integer)
Line 2: n (array size)
Line 3: n integers

============================================================
OUTPUT
============================================================
Product of the two smallest elements (if their sum <= sum)
0 if their sum > sum
-1 if n < 2 or null

============================================================
CONSTRAINTS
============================================================
-10^5 <= arr[i] <= 10^5
-10^5 <= sum <= 10^5

============================================================
EXAMPLE 1
============================================================
Input:
9
7
5 2 4 3 9 7 1

Two smallest: 1, 2 → sum = 3 <= 9 → product = 2
Output: 2

============================================================
EXAMPLE 2
============================================================
Input:
2
5
5 6 7 8 9

Two smallest: 5, 6 → sum = 11 > 2
Output: 0

============================================================
EDGE CASES
============================================================
1. n < 2 → return -1
2. Negative numbers: two smallest may both be negative
3. Sum target = 0 and both elements negative (neg + neg <= 0)
4. Duplicates: if smallest two are both same value, that's fine
============================================================
TIME COMPLEXITY  : O(N log N) — sort  |  OR O(N) with linear scan
SPACE COMPLEXITY : O(1) if using partial sort trick
============================================================
*/

import java.util.*;
import java.io.*;

public class Q02ProductSmallestPair {

    public static long productSmallestPair(int sum, int[] arr) {
        if (arr == null || arr.length < 2) return -1;
        // Write your solution here
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine().trim());
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(productSmallestPair(sum, arr));
    }
}
