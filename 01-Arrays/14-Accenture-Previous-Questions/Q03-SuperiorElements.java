/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-ARR-H03
Title         : Superior Array Elements (Leader in Array)
Historical Status : PROBABLE
Reported Year(s)  : 2025
Topic         : Arrays — Traversal
Difficulty    : EASY
Accenture Pattern : MEDIUM
Source        : PrepInsta 2025, Reddit r/developersIndia
============================================================
PROBLEM
============================================================
An element is called a SUPERIOR ELEMENT if it is strictly
GREATER than ALL elements to its RIGHT.

Given an array arr of n integers, find and print all superior
elements in the order they appear, along with their count.

The RIGHTMOST element is always a superior element.

============================================================
EXAMPLE 1
============================================================
Input: n=6, arr=[7, 9, 5, 2, 8, 7]

Superior elements (checking from right):
- 7 (rightmost) ✓
- 8 > 7 ✓
- 2 < 8 ✗
- 5 < 8 ✗
- 9 > 8 ✓
- 7 < 9 ✗

Output:
Superior elements: 9 8 7
Count: 3

============================================================
EDGE CASES
============================================================
1. Single element → it is superior
2. Sorted descending → all are superior
3. Sorted ascending → only last is superior
============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(N) — to store result before printing in order
============================================================
*/

import java.util.*;

public class Q03SuperiorElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        // Write your solution here
    }
}
