/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-ARR-T01
Title         : Basic Array Traversal and Print
Historical Status : PRACTICE VARIANT
Topic         : Arrays — Traversal
Difficulty    : EASY
Accenture Pattern : MEDIUM (foundation for all array questions)
============================================================
PROBLEM
============================================================
Given an integer array of size n, print each element on a
new line. Then print the total sum of all elements on the
last line.

============================================================
INPUT
============================================================
Line 1: Integer n (size of array, 1 <= n <= 100)
Line 2: n space-separated integers

============================================================
OUTPUT
============================================================
n lines: each element on its own line
Last line: total sum

============================================================
CONSTRAINTS
============================================================
1 <= n <= 100
-10^4 <= arr[i] <= 10^4

============================================================
EXAMPLE 1
============================================================
Input:
5
1 2 3 4 5

Output:
1
2
3
4
5
Sum: 15

============================================================
EXAMPLE 2
============================================================
Input:
3
-1 0 5

Output:
-1
0
5
Sum: 4

============================================================
EDGE CASES
============================================================
1. Single element array
2. Array with all negative numbers
3. Array with zeros

============================================================
EXPECTED APPROACH
============================================================
Simple O(N) loop. No tricks needed. Practice clean input reading.

============================================================
TIME COMPLEXITY  : O(N)
SPACE COMPLEXITY : O(1)
============================================================
*/

import java.util.*;
import java.io.*;

public class Q01BasicTraversal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        // Write your solution here

    }
}
