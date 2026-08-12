/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-ARR-I03
Title         : Large Small Sum (Even/Odd Index)
Historical Status : CONFIRMED
Reported Year(s)  : 2021, 2022, 2023
Role          : ASE / Advanced ASE
Package       : ₹4.5 – ₹9.8 LPA (unified test)
Topic         : Arrays — Indexing
Difficulty    : EASY-MEDIUM
Accenture Pattern : HIGH (repeated across 3 years)
Source        : GitHub anshumanbiswal14, PrepInsta, GFG
============================================================
PROBLEM
============================================================
Write a function LargeSmallSum(arr, n) that accepts an
integer array arr of size n with unique elements.

Steps:
1. Collect elements at EVEN indices (0, 2, 4, ...) → even_arr
2. Collect elements at ODD indices (1, 3, 5, ...)  → odd_arr
3. Find the SECOND LARGEST element from even_arr
4. Find the SECOND SMALLEST element from odd_arr
5. Return their SUM

============================================================
INPUT
============================================================
Line 1: n (size of array)
Line 2: n space-separated integers

============================================================
OUTPUT
============================================================
Single integer: sum of second largest (even) + second smallest (odd)
Special case: Return 0 if n <= 3 OR array is null

============================================================
CONSTRAINTS
============================================================
1 <= n <= 1000
All elements are unique
-10^5 <= arr[i] <= 10^5

============================================================
EXAMPLE 1
============================================================
Input:
6
3 2 1 7 5 4

Even indices [0,2,4]: 3, 1, 5 → sorted: [1,3,5] → 2nd largest = 3
Odd indices  [1,3,5]: 2, 7, 4 → sorted: [2,4,7] → 2nd smallest = 4

Output: 7

============================================================
EXAMPLE 2
============================================================
Input:
4
10 20 30 40

Even indices [0,2]: 10, 30 → 2nd largest = 10
Odd indices  [1,3]: 20, 40 → 2nd smallest = 40

Output: 50

============================================================
EDGE CASES
============================================================
1. n <= 3 → return 0
2. Only 2 elements at even indices → 2nd largest is the smaller one
3. Large negative values
4. All elements the same (BUT problem says unique, so this won't happen)

============================================================
EXPECTED APPROACH
============================================================
1. Separate into two lists based on even/odd index
2. Sort both lists
3. Second largest of sorted list = arr[size-2]
4. Second smallest of sorted list = arr[1]
5. Sum them

============================================================
TIME COMPLEXITY  : O(N log N) — due to sorting
SPACE COMPLEXITY : O(N)
============================================================
*/

import java.util.*;
import java.io.*;

public class Q03LargeSmallSum {

    public static int largeSmallSum(int[] arr, int n) {
        if (arr == null || n <= 3) return 0;

        // Write your solution here
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(largeSmallSum(arr, n));
    }
}
