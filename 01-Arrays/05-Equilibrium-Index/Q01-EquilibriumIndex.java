/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-ARR-E01
Title         : Equilibrium Index
Historical Status : PROBABLE (2026 report) / CONFIRMED Pattern
Reported Year(s)  : 2026 (Probable), repeated across AASE level
Role          : Advanced ASE
Package       : ₹6.5–9.8 LPA
Topic         : Arrays — Equilibrium Index
Difficulty    : MEDIUM
Accenture Pattern : HIGH
Source        : FacePrep 2026, PrepInsta archives
============================================================
PROBLEM
============================================================
Given an integer array arr of size n, find the EQUILIBRIUM
INDEX — an index i such that:

    sum(arr[0..i-1]) == sum(arr[i+1..n-1])

(Sum of elements to the LEFT of i equals sum to the RIGHT)

Return the FIRST such index (0-indexed).
Return -1 if no equilibrium index exists.

============================================================
INPUT
============================================================
Line 1: n
Line 2: n integers

============================================================
OUTPUT
============================================================
The equilibrium index (0-based), or -1

============================================================
CONSTRAINTS
============================================================
1 <= n <= 10^5
-10^5 <= arr[i] <= 10^5

============================================================
EXAMPLE 1
============================================================
Input:
7
-7 1 5 2 -4 3 0

Output: 3

Explanation:
Left of index 3:  -7 + 1 + 5 = -1
Right of index 3: -4 + 3 + 0 = -1
-1 == -1 ✓

============================================================
EXAMPLE 2
============================================================
Input:
1
5

Output: 0
(Single element: left sum = 0, right sum = 0)

============================================================
EXAMPLE 3
============================================================
Input:
3
1 2 3

Output: -1

============================================================
EDGE CASES
============================================================
1. Single element → index 0 is always equilibrium
2. First element is equilibrium (left sum = 0)
3. Last element is equilibrium (right sum = 0)
4. All zeros → first index (0)
5. Large negative values: use long for sums

============================================================
EXPECTED APPROACH
============================================================
1. Calculate total sum of the array
2. Iterate left to right, maintaining leftSum
3. At each index i: rightSum = totalSum - leftSum - arr[i]
4. If leftSum == rightSum → return i
5. Update leftSum += arr[i]

============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(1)
============================================================
*/

import java.util.*;
import java.io.*;

public class Q01EquilibriumIndex {

    public static int findEquilibriumIndex(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        // Write your solution here
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(findEquilibriumIndex(arr));
    }
}
