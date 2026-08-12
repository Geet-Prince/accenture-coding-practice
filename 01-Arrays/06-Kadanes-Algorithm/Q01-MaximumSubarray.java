/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-ARR-K01
Title         : Maximum Subarray Sum (Kadane's Algorithm)
Historical Status : CONFIRMED
Reported Year(s)  : 2022, 2023, 2024
Topic         : Arrays — Kadane's Algorithm
Difficulty    : MEDIUM
Accenture Pattern : HIGH
Source        : PrepInsta, GFG Accenture archive
============================================================
PROBLEM
============================================================
Given a 1D array of integers (may contain negatives), find
the contiguous subarray that has the maximum sum.
Return the maximum sum.

============================================================
INPUT
============================================================
Line 1: n
Line 2: n integers (can be negative)

============================================================
OUTPUT
============================================================
Single integer: maximum subarray sum

============================================================
CONSTRAINTS
============================================================
1 <= n <= 10^5
-10^4 <= arr[i] <= 10^4

============================================================
EXAMPLE 1
============================================================
Input:
9
-2 1 -3 4 -1 2 1 -5 4

Output: 6

Explanation: Subarray [4, -1, 2, 1] has sum = 6

============================================================
EXAMPLE 2
============================================================
Input:
4
-3 -1 -4 -2

Output: -1

Explanation: All negative — return the largest single element

============================================================
EDGE CASES
============================================================
1. All negative numbers → return the maximum single element
2. Single element → return that element
3. All same value
4. Large positive followed by large negative

============================================================
EXPECTED APPROACH
============================================================
Kadane's Algorithm:
- currentMax = arr[0]
- maxSoFar = arr[0]
- For each element from index 1:
    currentMax = max(arr[i], currentMax + arr[i])
    maxSoFar = max(maxSoFar, currentMax)
- Return maxSoFar

============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(1)
============================================================
*/

import java.util.*;
import java.io.*;

public class Q01MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        // Write your solution here
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(maxSubArray(arr));
    }
}
